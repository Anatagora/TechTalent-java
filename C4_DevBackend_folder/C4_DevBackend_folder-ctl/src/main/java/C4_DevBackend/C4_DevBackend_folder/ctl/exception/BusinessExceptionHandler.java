package C4_DevBackend.C4_DevBackend_folder.ctl.exception;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.org.thinkcloud.commons.response.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : zhangqian9158@gmail.com
 */
@Slf4j
@ControllerAdvice
public class BusinessExceptionHandler {

    @ExceptionHandler({BusinessException.class, Exception.class})
    public ResponseEntity<?> handlerException(Exception ex) {
        Map<String, Object> error = new HashMap<>(2);

        // 业务异常
        if (ex instanceof BusinessException) {
            error.put("code", ((BusinessException) ex).getCode());
            error.put("message", ex.getMessage());
            log.warn("[全局业务异常]\r\n业务编码：{}\r\n异常记录：{}", error.get("code"),
                    error.get("message"));
        }

        // 统一处理 JSON 参数验证
        else if (ex instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException methodArgumentNotValidException = (MethodArgumentNotValidException) ex;
            BindingResult bindingResult = methodArgumentNotValidException
                    .getBindingResult();
            String msg = bindingResult.getFieldErrors().stream()
                    .map(FieldError::getDefaultMessage).distinct()
                    .collect(Collectors.joining(","));
            error.put("code", HttpStatus.BAD_REQUEST.value());
            error.put("message", msg);
        }

        // 统一处理表单绑定验证
        else if (ex instanceof BindException) {
            BindException bindException = (BindException) ex;
            BindingResult bindingResult = bindException.getBindingResult();
            String msg = bindingResult.getAllErrors().stream()
                    .map(DefaultMessageSourceResolvable::getDefaultMessage).distinct()
                    .collect(Collectors.joining(","));
            error.put("code", HttpStatus.BAD_REQUEST.value());
            error.put("message", msg);
        }

        // 未知错误
        else {
            error.put("code", ResponseCode.UNKNOWN.code());
            error.put("message", ResponseCode.UNKNOWN.message());
            log.error(ex.getMessage());
            return new ResponseEntity<>(error,  HttpStatus.INTERNAL_SERVER_ERROR);
        }
        error.put("data",null);
        log.error(ExceptionUtil.stacktraceToString(ex,5000));
        return new ResponseEntity<>(error, HttpStatus.OK);
    }

}
