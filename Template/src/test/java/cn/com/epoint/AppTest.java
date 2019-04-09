package cn.com.epoint;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void getTemplate() throws Exception {
        JDBCDao jdbcDao = new JDBCDao();
        List<?> list = jdbcDao.query();
        System.out.println(list);
    }
}
