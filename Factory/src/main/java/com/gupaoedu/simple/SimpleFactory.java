package com.gupaoedu.simple;

import com.gupaoedu.*;

/**
 * @Author llhan
 * @Date 2019/3/8下午11:21
 */
public class SimpleFactory {

    public Shoes getShoesType(String shoesFactory) {
        if ("Nike".equals(shoesFactory)){
            return new Nike();
        }else if ("Adidas".equals(shoesFactory)){
            return  new Adidas();
        }else if ("Vans".equals(shoesFactory)){
            return new Vans();
        }else if ("Lining".equals(shoesFactory)){
            return new Lining();
        }
        return null;
    }

}
