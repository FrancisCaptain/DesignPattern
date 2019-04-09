package cn.com.epoint.shallow;

import java.util.Date;

/**
 * @Author llhan
 * @Date 2018/8/10 下午4:04
 */
public class Person implements Cloneable {

    public String name;

    public String age;

    public Date birthday;

    public Features features;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
