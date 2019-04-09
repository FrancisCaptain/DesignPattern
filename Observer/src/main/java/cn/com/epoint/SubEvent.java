package cn.com.epoint;

/**
 * @Author llhan
 * @Date 2018-09-26 16:52
 */
public class SubEvent extends EventLisenter {

    public void add(){
        System.out.println("调用增加方法");
        trigger(SubEventType.ON_ADD);
    }

}
