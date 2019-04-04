package com.guotao.www.util;

import java.sql.*;

public class ConnectionUtil {
    private static final String url = "jdbc:mysql://129.204.206.191:3306/vtmerBlog?useUnicode=true&amp;characterEncoding=utf-8";
    private static final String username = "guotao";
    private static final String password = "guotao";

    public static Connection getMysqlConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void close(ResultSet rs, PreparedStatement prt, Connection con){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (prt != null) {
            try {
                prt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
