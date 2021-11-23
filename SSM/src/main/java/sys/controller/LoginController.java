package sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sys.domain.login.LoginInfo;
import sys.domain.login.ReturnInfo;
import sys.service.LoginService;
import sys.service.impl.LoginServiceImpl;

import javax.annotation.Resource;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource
    private LoginService service;
    @RequestMapping("/in")
    @ResponseBody
    public ReturnInfo login(LoginInfo info){
        boolean result = service.certificate(info);
        ReturnInfo returnInfo = new ReturnInfo();
        if (result){
            returnInfo.setState("ok");
            returnInfo.setMessage("登陆成功");
        } else {
            returnInfo.setState("err");
            returnInfo.setMessage("登陆失败,密码有误");
        }
        return returnInfo;
    }
}
