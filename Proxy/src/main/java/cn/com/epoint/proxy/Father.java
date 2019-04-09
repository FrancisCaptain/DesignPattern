package cn.com.epoint.proxy;

/**
 * @Author llhan
 * @Date 2018/8/10 下午5:33
 */
public class Father {

    public Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove(){
        System.out.println("---------根据你的要求---------");
        this.person.findLove();
        System.out.println("---------可以结婚了---------");
    }
}
