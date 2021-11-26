package sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sys.domain.user.ReturnInfo;
import sys.domain.user.TimeInfo;

@RequestMapping("/user")
@Controller
public class UserInfoController {
    @RequestMapping("/info")
    @ResponseBody
    public ReturnInfo getUserInfo(String Cookie){
        /*
        * 查询数据库
        * */
        ReturnInfo info = new ReturnInfo();
        info.setId("3119005418");//假数据
        info.setClassNo("信安一");
        info.setSpeciality("信息安全");
        TimeInfo timeInfo = new TimeInfo(5,2,6,17,9);
        info.setTimeInfo(timeInfo);
        return info;
    }
}
