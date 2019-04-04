package com.guotao.www.dao.impl;

import com.guotao.www.dao.UserInformationDao;
import com.guotao.www.dto.UserLoginDTO;
import com.guotao.www.entity.Role;
import com.guotao.www.entity.UserInformation;
import com.guotao.www.entity.UserRole;
import com.guotao.www.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * GuoT 19.3.27
 */
public class UserInformationDaoImpl implements UserInformationDao {
    /**
     * 用于登录时匹配账号密码
     * @param username
     * @param password
     * @return
     */
    @Override
    public UserInformation getUserInformationByLogin(String username, String password) {
        Connection con = ConnectionUtil.getMysqlConnection();
        String sql = "select * from user_information where (login_name = ? OR email = ?) and password = ? and is_delete = 0;";
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        UserInformation userInformation = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                userInformation = new UserInformation();
                userInformation.setUserId(rs.getString("user_id"));
                userInformation.setName(rs.getString("name"));
                userInformation.setEmail(rs.getString("email"));
                userInformation.setPhone(rs.getString("phone"));
                userInformation.setQq(rs.getString("qq"));
                userInformation.setWx(rs.getString("wx"));
                userInformation.setAvatar(rs.getString("avatar"));
                userInformation.setDescription(rs.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(rs, preparedStatement, con);
        }
        return userInformation;
    }

    /**
     * 用于注册时向user_information表中插入一条用户信息
     * @param userInformation
     */
    @Override
    public void insertUserInformation(UserInformation userInformation) {
        Connection con = ConnectionUtil.getMysqlConnection();
        String sql = "insert into user_information (user_id, name, login_name, password, is_delete, created_time) values (?, ?, ?, ?, ? , now());";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, userInformation.getUserId());
            preparedStatement.setString(2, userInformation.getName());
            preparedStatement.setString(3, userInformation.getLoginName());
            preparedStatement.setString(4, userInformation.getPassword());
            preparedStatement.setString(5, userInformation.getIsDelete());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(null, preparedStatement, con);
        }
    }

    /**
     * 用于在user_information表中修改个人信息
     * @param userInformation
     */
    @Override
    public void updateUserInformation(UserInformation userInformation) {
        Connection con = ConnectionUtil.getMysqlConnection();
        String sql = "update user_information set name = ?, description = ?, avatar = null, update_time = now() where user_id = ?;";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, userInformation.getName());
            preparedStatement.setString(2, userInformation.getDescription());
            preparedStatement.setString(3, userInformation.getUserId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(null, preparedStatement, con);
        }
    }
}
