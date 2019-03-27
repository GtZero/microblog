package com.guotao.www.dao;

import com.guotao.www.entity.Role;

/**
 * GuoT 19.3.27
 */
public interface RoleDao {
    /**
     * 通过用户编号，得到对应的角色信息
     * @param userId
     * @return
     */
    Role getRoleByUserId(String userId);
}
