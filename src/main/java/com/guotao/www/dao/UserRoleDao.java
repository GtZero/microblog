package com.guotao.www.dao;

/**
 * 用户角色中间表Dao层
 * GuoT 19.3.28
 */
public interface UserRoleDao {
    /**
     * 向user 与 role 的中间表 user_role 插入一条数据
     */
    void insertUserRole(String userId, String roleId);
}
