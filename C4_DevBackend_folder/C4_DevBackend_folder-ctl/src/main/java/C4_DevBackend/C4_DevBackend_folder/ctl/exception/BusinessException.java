package C4_DevBackend.C4_DevBackend_folder.ctl.exception;

import cn.org.thinkcloud.commons.response.ResponseCode;

/**
 * @author : zhangqian9158@gmail.com
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = -823537371151080504L;

	private Integer code;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public BusinessException() {
	}

	public BusinessException(String message) {
		super(message);
		this.code = -1;
	}

	public BusinessException(ResponseCode status) {
		super(status.message());
		this.code = status.code();
	}

}
