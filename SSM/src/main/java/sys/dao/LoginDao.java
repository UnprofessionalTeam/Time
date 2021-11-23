package sys.dao;

import sys.domain.login.LoginInfo;
import sys.domain.login.RegisterInfo;

public interface LoginDao {
    LoginInfo selectUserInfo(LoginInfo info);
    int addUser(RegisterInfo info);
}
