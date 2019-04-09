package cn.com.epoint;

import cn.com.epoint.deep.SunWK;
import cn.com.epoint.shallow.Features;
import cn.com.epoint.shallow.Person;

import java.util.Date;

/**
 * @Author llhan
 * @Date 2018/8/10 下午4:07
 */
public class Test {

    @org.junit.Test
    public void getShallow() {
        Person person = new Person();
        person.name = "张三";
        person.age = "18";
        person.birthday = new Date();
        person.features = new Features();
        System.out.println(person);
        System.out.println(person.features);
        try {
            Person copy = (Person) person.clone();
            System.out.println(copy.features);

            System.out.println(person.features == copy.features);
            System.out.println(copy);

            System.out.println(person == copy);

            System.out.println(copy.birthday == person.birthday);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    @org.junit.Test
    public void getDeep() {
        SunWK sunWK = new SunWK();
        sunWK.name = "齐天大圣";
        sunWK.age = 18;
        sunWK.jinGuBang.getBig();

        System.out.println(sunWK);
        System.out.println(sunWK.name);


        try {
            SunWK copy = (SunWK)sunWK.clone();
            System.out.println(copy.jinGuBang.height);

            System.out.println(sunWK.name == copy.name);

            System.out.println(sunWK == copy);

            System.out.println(sunWK.jinGuBang == copy.jinGuBang);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
