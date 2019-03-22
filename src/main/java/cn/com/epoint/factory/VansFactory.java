package cn.com.epoint.factory;

import cn.com.epoint.Shoes;
import cn.com.epoint.Vans;

/**
 * @Author llhan
 * @Date 2019/3/8 下午11:30
 */
public class VansFactory implements Factory {
    @Override
    public Shoes getShoesType() {
        return new Vans();
    }
}
