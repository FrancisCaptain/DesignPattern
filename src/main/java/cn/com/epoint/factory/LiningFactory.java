package cn.com.epoint.factory;

import cn.com.epoint.Lining;
import cn.com.epoint.Shoes;

/**
 * @Author llhan
 * @Date 2019/3/8 下午11:41
 */
public class LiningFactory implements Factory {
    @Override
    public Shoes getShoesType() {
        return new Lining();
    }
}
