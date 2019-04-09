package cn.com.epoint;

/**
 * @Author llhan
 * @Date 2018/9/20 下午10:14
 */
public interface Payment {

    public PayState pay(Order order);

}
