package cn.com.epoint.singleton;

/**
 * @Author llhan
 * @Date 2018/8/3 下午11:43
 */
public class Lazy {

    public Lazy() {
    }

    private static Lazy lazy = null;

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
