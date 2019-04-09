package cn.com.epoint.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author llhan
 * @Date 2018/8/8 下午4:42
 */
public class MapRgeister {

    private MapRgeister() {
    }

    private static Map<String, Object> map = new ConcurrentHashMap<>();


    public static MapRgeister getInstance(String name) {
        if (name == null) {
            name = MapRgeister.class.getName();
        }
        if (map.get(name) == null) {
            try {
                map.put(name, new MapRgeister());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (MapRgeister) map.get(name);
    }
}
