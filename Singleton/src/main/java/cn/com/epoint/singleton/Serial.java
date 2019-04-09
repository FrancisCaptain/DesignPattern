package cn.com.epoint.singleton;

import java.io.Serializable;

/**
 * @Author llhan
 * @Date 2018/8/8 下午5:23
 */
public class Serial implements Serializable {

    public final static Serial SERIAL = new Serial();

    private Serial() {
    }

    public static Serial getInstance() {
        return SERIAL;
    }

    public Object readResolve() {
        return SERIAL;
    }

}
