package cn.com.epoint;

import cn.com.epoint.entity.Member;
import cn.com.epoint.entity.ResultMsg;

import java.util.UUID;

/**
 * @Author llhan
 * @Date 2018-09-26 10:54
 */
public class LoginService implements ILoginService {

    @Override
    public ResultMsg register(String userName, String pwd) {
        return new ResultMsg("200", "注册成功", new Member(UUID.randomUUID().toString(), userName, pwd));
    }

    @Override
    public ResultMsg login(String userName, String pwd) {
        Member member = new Member("张三", "123");
        member.setUid(UUID.randomUUID().toString());
        if (userName.equals(member.getUserName()) && pwd.equals(member.getPwd())) {
            return new ResultMsg("201", "登录成功", member);
        }
        return null;
    }
}
