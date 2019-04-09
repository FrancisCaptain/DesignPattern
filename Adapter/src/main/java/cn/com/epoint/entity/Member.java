package cn.com.epoint.entity;

/**
 * @Author llhan
 * @Date 2018-09-26 10:51
 */
public class Member {

    String uid;
    String userName;
    String pwd;

    public Member(String uid, String userName, String pwd) {
        this.uid = uid;
        this.userName = userName;
        this.pwd = pwd;
    }

    public Member(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "[标识码：" + uid + ", 用户名：" + userName + ", pwd=" + pwd + "]";
    }
}
