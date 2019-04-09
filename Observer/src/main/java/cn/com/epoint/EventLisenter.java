package cn.com.epoint;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author llhan
 * @Date 2018-09-26 16:33
 */
public class EventLisenter {

    protected Map<Enum, Event> map = new HashMap<Enum, Event>();

    public void addLisenter(Enum eventType, Object target, Method callback) {
        map.put(eventType, new Event(target, callback));
    }

    public void trigger(Enum eventType) {
        if (!this.map.containsKey(eventType)) {
            return;
        }
        Event e = this.map.get(eventType);
        e.setSource(this);
        e.setTime(System.currentTimeMillis());
        e.setTrigger(eventType.toString());
        try {
            e.getCallback().invoke(e.getTarget(), e);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
