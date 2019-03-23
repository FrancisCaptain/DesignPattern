package com.gupaoedu.factory;

import com.gupaoedu.Nike;
import com.gupaoedu.Shoes;

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
