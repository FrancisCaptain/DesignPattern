package cn.com.epoint;

import java.sql.ResultSet;

/**
 * @Author llhan
 * @Date 2018-09-21 11:45
 */
public interface RowMapper {

    public Person mapRow(ResultSet rs) throws Exception;
}
