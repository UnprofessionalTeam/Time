package sys.service.impl;

import org.springframework.stereotype.Service;
import sys.dao.LoginDao;
import sys.domain.login.LoginInfo;
import sys.service.LoginService;

import javax.annotation.Resource;


@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginDao loginDao;
    @Override
    public boolean certificate(LoginInfo info) {
        LoginInfo localInfo = loginDao.selectUserInfo(info);
        if(localInfo==null){return false;}
        return info.getPassword().equals(localInfo.getPassword());
    }
}
