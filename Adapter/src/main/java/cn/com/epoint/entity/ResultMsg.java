package cn.com.epoint.entity;

/**
 * @Author llhan
 * @Date 2018-09-26 10:50
 */
public class ResultMsg {

    public String code;
    public String msg;
    public Member data;

    public ResultMsg(String code, String msg, Member data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Member data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultMsg\n{状态码：" + code + ", \n" + msg + ",\n用户信息：" + data + "}";
    }
}
