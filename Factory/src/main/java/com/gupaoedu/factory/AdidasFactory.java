package com.gupaoedu.factory;

import com.gupaoedu.Adidas;
import com.gupaoedu.Shoes;

/**
 * @Author llhan
 * @Date 2019/3/8 下午11:29
 */
public class AdidasFactory implements Factory {
    @Override
    public Shoes getShoesType() {
        return new Adidas();
    }
}
