package C4_DevBackend.C4_DevBackend_folder.domain;

import cn.org.thinkcloud.base.commons.annotation.LikeField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import cn.org.thinkcloud.base.commons.domain.Domain;

/**
 * @author : zhangqian9158@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class UmsUser extends Domain {


    private static final long serialVersionUID = -1658851288182619881L;
    @LikeField("username")
    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @LikeField("nickname")
    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "用户状态：1(已启用) 0(已禁用)")
    private Integer status;


}
