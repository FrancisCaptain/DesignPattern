package cn.com.epoint;

/**
 * @Author llhan
 * @Date 2018/9/20 下午10:13
 */
public class Order {

    String uid;
    String orderId;
    double prices;

    public Order(String uid, String orderId, double prices) {
        this.uid = uid;
        this.orderId = orderId;
        this.prices = prices;
    }

    public PayState pay(PayType payType) {
        return payType.get().pay(new Order(uid, orderId, prices));
    }
}
