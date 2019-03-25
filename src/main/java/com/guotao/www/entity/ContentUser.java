package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class ContentUser implements Serializable {


	private static final long serialVersionUID =  5854160004485620600L;


	/**
	 * 博文编号
	 */
	private String contentId;

	/**
	 * 用户编码
	 */
	private String userId;

	/**
	 * 角色类型
	 */
	private String roleId;

	/**
	 * 开始时间
	 */
	private Date fromDate;

	/**
	 * 过期时间
	 */
	private Date thruDate;

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

	public  ContentUser(){};

	public  ContentUser(String contentId, String userId, String roleId, Date fromDate, Date thruDate, String flag, String isDelete, Date createdTime, Date updateTime){
	this.contentId = contentId;
	this.userId = userId;
	this.roleId = roleId;
	this.fromDate = fromDate;
	this.thruDate = thruDate;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
}

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getThruDate() {
		return thruDate;
	}

	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
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
