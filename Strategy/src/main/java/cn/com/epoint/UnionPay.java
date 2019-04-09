package cn.com.epoint;

/**
 * @Author llhan
 * @Date 2018/9/20 下午10:56
 */
public class UnionPay implements Payment {

    @Override
    public PayState pay(Order order) {
        System.out.println("-----欢迎使用银联支付-----");
        return new PayState(200, "支付成功", order);
    }
}
