package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class UserInformation implements Serializable {


	private static final long serialVersionUID =  6737138553451872347L;

	/**
	 * 编号
	 */
	private String userId;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 登陆名称
	 */
	private String loginName;

	/**
	 * 密码
	 */
	private String password;

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
	 * 使能标志
	 */
	private String flag;

	/**
	 * 删除标志
	 */
	private String isDelete;

	/**
	 * 创建时间
	 */
	private Date createdTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	public  UserInformation(){};

	public UserInformation(String loginName, String password, String email) {
		this.loginName = loginName;
		this.password = password;
		this.email = email;
	}

	public  UserInformation(String userId, String name, String loginName, String password, String email, String phone, String qq, String wx, Date birth, String avatar, String description, String flag, String isDelete, Date createdTime, Date updateTime){
	this.userId = userId;
	this.name = name;
	this.loginName = loginName;
	this.password = password;
	this.email = email;
	this.phone = phone;
	this.qq = qq;
	this.wx = wx;
	this.birth = birth;
	this.avatar = avatar;
	this.description = description;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
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

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
