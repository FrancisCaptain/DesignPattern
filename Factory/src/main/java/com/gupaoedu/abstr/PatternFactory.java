package com.gupaoedu.abstr;


import com.gupaoedu.*;

/**
 * @Author llhan
 * @Date 2019/3/8 下午11:35
 */
public class PatternFactory extends AbstractFactory {
    @Override
    public Shoes getNikeFactory() {
        return new Nike();
    }

    @Override
    public Shoes getAdidasFactory() {
        return new Adidas();
    }

    @Override
    public Shoes getVansFactory() {
        return new Vans();
    }

    @Override
    public Shoes getLiningFactory() {
        return new Lining();
    }
}
