package com.guotao.www.dto;

import java.util.Date;

public class UserLoginDTO {
    /**
     * 编号
     */
    private String userId;

    /**
     * 名称
     */
    private String name;

    /**
     * 邮件
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * QQ
     */
    private String qq;

    /**
     * WX
     */
    private String wx;

    /**
     * 生日
     */
    private Date birth;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 个人描述
     */
    private String description;

    /**
     * 角色编号
     */
    private String roleId;

    /**
     * 角色名称
     */
    private String roleName;

    public UserLoginDTO() {
    }

    public UserLoginDTO(String userId, String name, String email, String phone, String qq, String wx,
                        Date birth, String avatar, String description, String roleId, String roleName) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.qq = qq;
        this.wx = wx;
        this.birth = birth;
        this.avatar = avatar;
        this.description = description;
        this.roleId = roleId;
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "UserLoginDTO{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", qq='" + qq + '\'' +
                ", wx='" + wx + '\'' +
                ", birth=" + birth +
                ", avatar='" + avatar + '\'' +
                ", description='" + description + '\'' +
                ", roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
