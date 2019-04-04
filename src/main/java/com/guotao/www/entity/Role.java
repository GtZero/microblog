package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class Role implements Serializable {


	private static final long serialVersionUID =  4768877032280206518L;


	/**
	 * 角色编号
	 */
	private String roleId;

	/**
	 * 角色名称
	 */
	private String roleName;

	/**
	 * 上级角色编号
	 */
	private String roleParentId;

	/**
	 * 使能标识
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

	public  Role(){};

	public Role(String roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public  Role(String roleId, String roleName, String roleParentId, String flag, String isDelete, Date createdTime, Date updateTime){
	this.roleId = roleId;
	this.roleName = roleName;
	this.roleParentId = roleParentId;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
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

	public String getRoleParentId() {
		return roleParentId;
	}

	public void setRoleParentId(String roleParentId) {
		this.roleParentId = roleParentId;
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
