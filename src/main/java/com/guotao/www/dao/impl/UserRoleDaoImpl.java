package com.guotao.www.dao.impl;

import com.guotao.www.dao.UserRoleDao;
import com.guotao.www.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * GuoT 19.3.28
 */
public class UserRoleDaoImpl implements UserRoleDao {

    /**
     * 向user 与 role 的中间表 user_role 插入一条数据
     */
    @Override
    public void insertUserRole(String userId, String roleId) {
        Connection con = ConnectionUtil.getMysqlConnection();
        String sql = "insert into user_role (user_id, role_id , is_delete, created_time) values (?, ?, '0',now());";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, roleId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(null, preparedStatement, con);
        }
    }
}
