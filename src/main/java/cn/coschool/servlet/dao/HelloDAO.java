package cn.coschool.servlet.dao;

import cn.coschool.servlet.po.HelloPO;
import cn.coschool.servlet.util.DBUitl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author He Gang coschool@yeah.net
 * @version V1.0.0.0
 * @createTime：2018-04-13 22:00:00
 * @description
 */
public class HelloDAO {
    public int insert() {
        int ret = 0;
        Connection conn = null;
        Statement stat = null;
        try {
            conn = DBUitl.getConnection();
            stat = conn.createStatement();
            ret = stat.executeUpdate("INSERT INTO hello VALUES (null,'jack','男',12,'2018-09-09','2018-09-09 00:00:00','2018-09-09 00:00:00');");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    public int delete(int id) {
        int ret = 0;
        Connection conn = null;
        Statement stat = null;
        try {
            conn = DBUitl.getConnection();
            stat = conn.createStatement();
            ret = stat.executeUpdate("DELETE FROM hello WHERE id = "+id);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    public int update() {
        int ret = 0;
        Connection conn = null;
        Statement stat = null;
        try {
            conn = DBUitl.getConnection();
            stat = conn.createStatement();
            ret = stat.executeUpdate("UPDATE hello SET age = 13 WHERE id = '2';");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    public List<HelloPO> findAll() {
        List<HelloPO> helloPOS = new ArrayList<>();
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            conn = DBUitl.getConnection();
            stat = conn.createStatement();
            rs = stat.executeQuery("SELECT * FROM hello");
            while (rs.next()) {
                HelloPO helloPO = new HelloPO();
                helloPO.setId(rs.getInt("id"));
                helloPO.setUsername(rs.getString("username"));
                helloPO.setSex(rs.getString("sex"));
                helloPO.setAge(rs.getInt("age"));
                helloPO.setBirthday(rs.getDate("birthday"));
                helloPO.setCreateTime(rs.getDate("createTime"));
                helloPO.setLastModTime(rs.getDate("lastModTime"));
                helloPOS.add(helloPO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                stat.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return helloPOS;
    }
}