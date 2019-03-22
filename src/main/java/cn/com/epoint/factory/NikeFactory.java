package cn.com.epoint.factory;

import cn.com.epoint.Nike;
import cn.com.epoint.Shoes;

/**
 * @Author llhan
 * @Date 2019/3/8 下午11:29
 */
public class NikeFactory implements Factory {
    @Override
    public Shoes getShoesType() {
        return new Nike();
    }
}
