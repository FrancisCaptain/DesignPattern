package cn.com.epoint;

/**
 * @Author llhan
 * @Date 2018/9/20 下午10:44
 */
public enum PayType {

    ALI_PAY(new Alipay()),
    WECHAT_PAY(new WechatPay()),
    UNION_PAY(new UnionPay());

    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment get(){
        return this.payment;
    }
}
