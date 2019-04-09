package cn.com.epoint;

import cn.com.epoint.proxy.Father;
import cn.com.epoint.proxy.Son;

/**
 * @Author llhan
 * @Date 2018/8/10 下午5:36
 */
public class Test {

    @org.junit.Test
    public void getLove(){
        Father father = new Father(new Son());
        father.findLove();
    }
}
