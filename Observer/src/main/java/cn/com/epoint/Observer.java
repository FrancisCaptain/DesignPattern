package cn.com.epoint;

/**
 * @Author llhan
 * @Date 2018-09-26 16:56
 */
public class Observer {

    public void advice(Event e) {
        System.out.println("触发事件，打印日志\n" + e);
    }
}
