package com.dust.util;

import java.sql.*;
import java.util.Properties;

/**
 * @author zgq
 * @data 2021/6/1  21:45
 **/
public class JdbcUtils {

    private static Connection conn = null;


    public static Connection getConn() {
        PropertiesUtil.loadFile("config/jdbc.properties");
        String driver = PropertiesUtil.getPropertyValue("jdbc.driver");
        String url = PropertiesUtil.getPropertyValue("jdbc.url");
        String username = PropertiesUtil.getPropertyValue("jdbc.username");
        String password = PropertiesUtil.getPropertyValue("jdbc.password");

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;


    }

    public static void close() {
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void main(String[] args) {

        Connection conn = JdbcUtils.getConn();

        Statement stmt = null;
        ResultSet ret = null;

        try {
            stmt = conn.createStatement();
            ret = stmt.executeQuery("select * from user");
            while (ret.next()) {
                String p = ret.getString(2);
                System.out.println(p);
            }

            stmt.close();
            ret.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }


}
