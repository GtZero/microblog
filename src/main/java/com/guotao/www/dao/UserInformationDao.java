package com.guotao.www.dao;

import com.guotao.www.entity.UserInformation;

/**
 * GuoT 19.3.27
 */
public interface UserInformationDao {
    /**
     * 用于登录时匹配账号密码
     * @param username
     * @param password
     * @return
     */
    UserInformation getUserInformationByLogin(String username, String password);

    /**
     * 用于注册时向user_information表中插入一条用户信息
     * @param userInformation
     */
    void insertUserInformation(UserInformation userInformation);

    /**
     * 用于在user_information表中修改个人信息
     * @param userInformation
     */
    void updateUserInformation(UserInformation userInformation);
}
