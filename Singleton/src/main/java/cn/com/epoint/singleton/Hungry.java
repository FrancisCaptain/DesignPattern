package cn.com.epoint.singleton;

/**
 * @Author llhan
 * @Date 2018/8/3 下午11:29
 * 类加载的时候初始化
 *
 */
public class Hungry {

    public Hungry() {
    }

    private static Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
}
