package cn.com.epoint.observer;

import cn.com.epoint.EventLisenter;

/**
 * @Author llhan
 * @Date 2018-09-26 18:34
 */
public class Mouse extends EventLisenter {

    public void click() {
        System.out.println("鼠标单击");
        super.trigger(MouseType.ON_CLICK);
    }

    public void double_click() {
        System.out.println("鼠标双击");
        super.trigger(MouseType.ON_DOUBLE_CLICK);
    }

    public void wheel() {
        System.out.println("鼠标滚动");
        super.trigger(MouseType.ON_WHEEL);
    }

}
