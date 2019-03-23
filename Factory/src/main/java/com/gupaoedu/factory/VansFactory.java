package com.gupaoedu.factory;

import com.gupaoedu.Shoes;
import com.gupaoedu.Vans;

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
