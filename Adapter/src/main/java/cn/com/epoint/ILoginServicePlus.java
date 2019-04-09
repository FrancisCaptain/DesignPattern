package cn.com.epoint;

import cn.com.epoint.entity.ResultMsg;

/**
 * @Author llhan
 * @Date 2018-09-26 11:34
 */
public interface ILoginServicePlus extends ILoginService {

    public ResultMsg register(String openID);

}
