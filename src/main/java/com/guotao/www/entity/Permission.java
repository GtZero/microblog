package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class Permission implements Serializable {


	private static final long serialVersionUID =  1220216597161850642L;


	/**
	 * 权限编号
	 */
	private String permissionId;

	/**
	 * 权限路径
	 */
	private String permissionUrl;

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

	public  Permission(){};

	public  Permission(String permissionId, String permissionUrl, String flag, String isDelete, Date createdTime, Date updateTime){
	this.permissionId = permissionId;
	this.permissionUrl = permissionUrl;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
}

	public String getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionUrl() {
		return permissionUrl;
	}

	public void setPermissionUrl(String permissionUrl) {
		this.permissionUrl = permissionUrl;
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
