package cn.com.epoint.singleton;

/**
 * @Author llhan
 * @Date 2018/8/4 上午12:01
 */
public class LazySynch {

    public LazySynch() {
    }

    private static LazySynch lazySynch = null;

    public static synchronized LazySynch getInstance() {
        if (lazySynch == null) {
            lazySynch = new LazySynch();
        }
        return lazySynch;
    }

}
