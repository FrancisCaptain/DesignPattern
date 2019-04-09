package cn.com.epoint.deep;

import java.io.Serializable;

/**
 * @Author llhan
 * @Date 2018/8/10 下午4:44
 */
public class JinGuBang implements Serializable {

    public double height = 10;

    public double weight = 10;

    public void getBig() {
        this.height *= 2;
        this.weight *= 2;
    }

    public void getSmall() {
        this.height /= 2;
        this.weight /= 2;
    }

}
