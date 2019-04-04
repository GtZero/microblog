package com.guotao.www.dao.impl;

import com.guotao.www.dao.RoleDao;
import com.guotao.www.entity.Role;
import com.guotao.www.entity.UserInformation;
import com.guotao.www.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * GuoT 19.3.27
 */
public class RoleDaoImpl implements RoleDao {
    /**
     * 通过用户编号，得到对应的角色信息
     * @param userId
     * @return
     */
    @Override
    public Role getRoleByUserId(String userId) {
        Connection con = ConnectionUtil.getMysqlConnection();
        String sql = "SELECT r.role_id,r.role_name FROM role r,user_role u where r.role_id = u.role_id and u.user_id = ? and u.is_delete = 0 and  r.is_delete = 0;";
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Role role = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, userId);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                role = new Role(rs.getString("role_id"), rs.getString("role_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(rs, preparedStatement, con);
        }
        return role;
    }
}
