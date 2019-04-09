package cn.com.epoint;

import java.sql.ResultSet;
import java.util.List;

/**
 * @Author llhan
 * @Date 2018-09-21 14:15
 */
public class JDBCDao {

    public JDBCTemplate jdbcTemplate = new JDBCTemplate(null);

    public List<?> query() throws Exception {
        String sql = "SELECT * FROM t_person;";
        return jdbcTemplate.executeQuery(sql, new RowMapper() {
            @Override
            public Person mapRow(ResultSet rs) throws Exception {
                Person person = new Person();
                person.setName(rs.getString("name"));
                person.setAge(rs.getString("age"));
                return person;
            }
        });
    }
}
