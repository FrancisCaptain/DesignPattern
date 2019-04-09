package cn.com.epoint;

import cn.com.epoint.observer.Mouse;
import cn.com.epoint.observer.MouseType;
import cn.com.epoint.observer.ObserverMouse;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void getObserver() throws Exception {
        Observer observer = new Observer();
        Method advice = Observer.class.getMethod("advice", new Class<?>[]{Event.class});
        SubEvent subEvent = new SubEvent();
        subEvent.addLisenter(SubEventType.ON_ADD, observer, advice);
        subEvent.add();
    }

    @Test
    public void getMouseObserver() throws Exception {
        ObserverMouse observerMouse = new ObserverMouse();
        Method advice = ObserverMouse.class.getMethod("double_click", Event.class);
        Mouse mouse = new Mouse();
        mouse.addLisenter(MouseType.ON_DOUBLE_CLICK, observerMouse, advice);
        mouse.double_click();
    }
}
