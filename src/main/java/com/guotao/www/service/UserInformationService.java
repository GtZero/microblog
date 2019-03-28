package com.guotao.www.service;

import com.guotao.www.constants.BlogConstant;
import com.guotao.www.dao.RoleDao;
import com.guotao.www.dao.UserInformationDao;
import com.guotao.www.dao.UserRoleDao;
import com.guotao.www.dao.impl.RoleDaoImpl;
import com.guotao.www.dao.impl.UserInformationDaoImpl;
import com.guotao.www.dao.impl.UserRoleDaoImpl;
import com.guotao.www.dto.UserLoginDTO;
import com.guotao.www.entity.Role;
import com.guotao.www.entity.UserInformation;
import com.guotao.www.util.IdUtil;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * GuoT 19.3.27
 */
public class UserInformationService {

    UserInformationDao userInformationDao = new UserInformationDaoImpl();

    RoleDao roleDao = new RoleDaoImpl();

    UserRoleDao userRoleDao = new UserRoleDaoImpl();

    /**
     * 验证登录时是否成功，成功返回用户信息，不成功返回NULL
     * @param username
     * @param password
     * @return
     */
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

    /**
     * 注册,添加一条用户信息
     * @param userInformation
     */
    public void insertUserInformation(UserInformation userInformation) {
        String userId = IdUtil.getUUID();
        userInformation.setUserId(userId);
        userInformation.setName(BlogConstant.USER_DEFAULT_NAME);
        // TODO 用户默认头像url GuoT 19.3.28 19.4.5
        userInformation.setAvatar("");
        userInformation.setIsDelete(BlogConstant.ISDELETE_NO);
        userInformation.setCreatedTime(new Date());
        userInformationDao.insertUserInformation(userInformation);
        userRoleDao.insertUserRole(userId, BlogConstant.USER_DEFAULT_ROLE_ID);
    }

    /**
     * 个人信息管理修改个人信息
     * @param userInformation
     */
    public void updateUserInformation(MultipartFile multipartFile, UserInformation userInformation) {
        // TODO 进行文件上传，返回头像的url设置进去 GuoT 19.3.28 暂时先不做
        /// userInformation.setAvatar("");
        userInformation.setUpdateTime(new Date());
        userInformationDao.updateUserInformation(userInformation);
    }
}
