package cn.com.epoint;

/**
 * @Author llhan
 * @Date 2018/9/20 下午10:15
 */
public class PayState {

    int code;
    String msg;
    Order order;

    public PayState(int code, String msg, Order order) {
        this.code = code;
        this.msg = msg;
        this.order = order;
    }

    @Override
    public String toString() {
        return "支付状态：" + code + ",支付信息：" + msg + ",\n[唯一标识：" + order.uid + ",订单号：" + order.orderId + ",支付金额：" + order.prices + "]";
    }
}
