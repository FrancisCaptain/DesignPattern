package cn.com.epoint;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author llhan
 * @Date 2018-09-21 10:47
 */
public class JDBCTemplate {

    public DataSource dataSource;

    public JDBCTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    public PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    public ResultSet executeQuery(PreparedStatement pstmt) throws SQLException {
        return pstmt.executeQuery();
    }

    public void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    public void closePreparedStatement(PreparedStatement pstmt) throws SQLException {
        pstmt.close();
    }

    public void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }

    public List<?> preResultSet(ResultSet rs, RowMapper rowMapper) throws Exception {
        List<Person> list = new ArrayList();
        while (rs.next()) {
            list.add(rowMapper.mapRow(rs));
        }
        return list;
    }

    public List<?> executeQuery(String sql, RowMapper rowMapper) throws Exception {
        //1.创建连接
        Connection conn = getConnection();
        //2.获取语句集
        PreparedStatement pstmt = createPrepareStatement(conn, sql);
        //3.执行语句集，并接收结果集
        ResultSet rs = executeQuery(pstmt);
        //4.解析语句集
        List<?> result = preResultSet(rs, rowMapper);
        //5.关闭结果集
        closeResultSet(rs);
        //6.关闭语句集
        closePreparedStatement(pstmt);
        //7.关闭连接
        closeConnection(conn);
        return result;
    }
}
