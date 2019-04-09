package cn.com.epoint;

import cn.com.epoint.entity.ResultMsg;

/**
 * @Author llhan
 * @Date 2018-09-26 11:15
 */
public interface ILoginService {

    public ResultMsg register(String userName, String pwd);

    public ResultMsg login(String userName, String pwd);

}
