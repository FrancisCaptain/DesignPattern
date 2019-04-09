package cn.com.epoint;

import cn.com.epoint.entity.ResultMsg;

/**
 * @Author llhan
 * @Date 2018-09-26 11:30
 */
public class LoginServicePlus implements ILoginServicePlus {

    public LoginService loginService;

    public LoginServicePlus(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public ResultMsg register(String openID) {
        return loginService.register(openID, null);
    }

    @Override
    public ResultMsg register(String userName, String pwd) {
        return loginService.register(userName, pwd);
    }

    @Override
    public ResultMsg login(String userName, String pwd) {
        return loginService.login(userName, pwd);
    }
}
