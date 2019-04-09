package cn.com.epoint.observer;

import cn.com.epoint.Event;

/**
 * @Author llhan
 * @Date 2018-09-26 18:39
 */
public class ObserverMouse {
    public void click(Event e) {
        System.out.println("触发鼠标单击事件\n" + e);
    }

    public void double_click(Event e) {
        System.out.println("触发鼠标双击事件\n" + e);
    }

    public void wheel(Event e) {
        System.out.println("触发鼠标滚动事件\n" + e);
    }
}
