package com.gupaoedu.abstr;


import com.gupaoedu.Shoes;

/**
 * @Author llhan
 * @Date 2019/3/8 下午11:33
 */
public abstract class AbstractFactory {

    public abstract Shoes getNikeFactory();

    public abstract Shoes getAdidasFactory();

    public abstract Shoes getVansFactory();

    public abstract Shoes getLiningFactory();

}
