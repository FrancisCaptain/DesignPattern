package cn.com.epoint;

import org.junit.Test;

import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.UUID;


public class AppTest {

    @Test
    public void getDecorator() {
        //DataInputStream功能更加强大
        //DataInputStream继承InputStream
        //装饰器模式：DataInputStream对父类引用进行包装
        //为了某个实现类在不修改原始类的基础上进行动态的覆盖或增加方法
        //该实现类要保持跟原有类的层级关系
        //实际上是一种非常特殊的适配器模式
        //原来的功能依旧保留对外开放，新的功能依旧可用
        //封装、继承、多态
        //装饰者和被装饰者都要实现同一个接口（为了扩展，保留OOP关系）
        //满足Is-a的关系
        //注重的是覆盖和扩展

        //适配器模式
        //可以不保留层级关系
        //适配者和被适配者没有必然的层级联系，通常采用代理或者继承形式进行包装
        //满足has-a关系
        //注重兼容、转换

        //观察者模式
        //发布者（Publish）和订阅者（Subscribe）
        InputStream in = null;
        FilterInputStream fis = new DataInputStream(in);
    }

    @Test
    public void getAdapter() {
        //LoginService loginService = new LoginService();
        //System.out.println(loginService.login("张三", "123"));
        //LoginServicePlus loginServicePlus = new LoginServicePlus();
        //System.out.println(loginServicePlus.register(UUID.randomUUID().toString()));
        ILoginServicePlus iLoginServicePlus = new LoginServicePlus(new LoginService());
        System.out.println(iLoginServicePlus.register(UUID.randomUUID().toString()));
    }
}
