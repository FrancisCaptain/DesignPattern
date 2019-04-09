package cn.com.epoint;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }


    @Test
    public void getStrategy() {

        Order order = new Order(UUID.randomUUID().toString(), "123321", 123.123);
        System.out.println(order.pay(PayType.UNION_PAY));
    }
}
