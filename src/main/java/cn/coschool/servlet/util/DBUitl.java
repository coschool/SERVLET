package cn.coschool.servlet.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author He Gang coschool@yeah.net
 * @version V1.0.0.0
 * @createTime：2018-04-13 22:00:00
 * @description
 */
public class DBUitl {
    private static String driver = null;
    private static String url = null;
    private static String une = null;
    private static String pwd = null;
    private static Connection conn = null;

    static {
        try {
            System.out.println("STATIC{} START");
            InputStream in = DBUitl.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties prop = new Properties();
            prop.load(in);
            driver = prop.getProperty("driver");
            url = prop.getProperty("url");
            une = prop.getProperty("une");
            pwd = prop.getProperty("pwd");
            Class.forName(driver);
            System.out.println("STATIC{} END");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //通过并发单例模式返回数据库连接对象
    public static Connection getConnection() {
        try {
            if (conn == null) {
                synchronized (DBUitl.class) {
                    if (conn == null) {
                        conn = DriverManager.getConnection(url, une, pwd); //获取数据库连接
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
