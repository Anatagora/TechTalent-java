package C4_DevBackend.C4_DevBackend_folder.repo.api.impl;


import C4_DevBackend.C4_DevBackend_folder.repo.api.UmsUserRepository;
import cn.org.thinkcloud.repo.base.service.api.impl.BaseRepositoryImpl;
import org.apache.dubbo.config.annotation.DubboService;
import C4_DevBackend.C4_DevBackend_folder.domain.UmsUser;
import C4_DevBackend.C4_DevBackend_folder.repo.mapper.UmsUserMapper;

/**
 * @author : zhangqian9158@gmail.com
 */
@DubboService(version = "1.0.0")
public class UmsUserRepositoryImpl extends BaseRepositoryImpl<UmsUserMapper, UmsUser> implements UmsUserRepository {

}
