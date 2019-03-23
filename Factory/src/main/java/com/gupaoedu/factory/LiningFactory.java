package com.gupaoedu.factory;

import com.gupaoedu.Lining;
import com.gupaoedu.Shoes;

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
