package cn.com.epoint.singleton;

/**
 * @Author llhan
 * @Date 2018/8/8 下午3:21
 */
public class LazyNB {


    private static boolean initialized = false;

    private LazyNB() {

        synchronized (LazyNB.class){
            if (initialized == false){
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例已被侵犯");
            }
        }

    }

    public static class LazyHolder{

        private static final LazyNB LAZY_NB = new LazyNB();

    }

    public static LazyNB getInstance(){
        return LazyHolder.LAZY_NB;
    }


}
