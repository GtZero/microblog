package com.guotao.www.service;

import com.guotao.www.dao.RoleDao;
import com.guotao.www.dao.UserInformationDao;
import com.guotao.www.dao.impl.RoleDaoImpl;
import com.guotao.www.dao.impl.UserInformationDaoImpl;
import com.guotao.www.dto.UserLoginDTO;
import com.guotao.www.entity.Role;
import com.guotao.www.entity.UserInformation;

/**
 * GuoT 19.3.27
 */
public class UserInformationService {

    UserInformationDao userInformationDao = new UserInformationDaoImpl();

    RoleDao roleDao = new RoleDaoImpl();

    public UserLoginDTO getUserInformationByLogin(String username, String password) {
        UserInformation userInformation = userInformationDao.getUserInformationByLogin(username,password);
        UserLoginDTO loginDTO = null;
        if (userInformation != null){
            Role role = roleDao.getRoleByUserId(userInformation.getUserId());
            loginDTO = new UserLoginDTO(userInformation.getUserId(), userInformation.getName(),
                    userInformation.getEmail(), userInformation.getPhone(), userInformation.getQq() ,
                    userInformation.getWx(), userInformation.getBirth(), userInformation.getAvatar(),
                    userInformation.getDescription(), role.getRoleId(), role.getRoleName());
        }
        return loginDTO;
    }
}
