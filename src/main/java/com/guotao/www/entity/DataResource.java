package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class DataResource implements Serializable {


	private static final long serialVersionUID =  8629971534418827175L;


	/**
	 * 数据资源编码
	 */
	private String dataResourceId;

	/**
	 * 数据资源类型编码
	 */
	private String dataResourceTypeId;

	/**
	 * 数据目录编码
	 */
	private String dataCategoryId;

	/**
	 * 数据资源名称
	 */
	private String dataResourceName;

	/**
	 * 数据资源描述
	 */
	private String dataResourceDescription;

	/**
	 * 是否公开
	 */
	private String isPublic;

	/**
	 * 创建日期
	 */
	private Date createdDate;

	/**
	 * 创建者
	 */
	private String createdByUserLogin;

	/**
	 * 更新日期
	 */
	private Date updatedDate;

	/**
	 * 更新者
	 */
	private String updatedByUserLogin;

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

	public  DataResource(){};

	public  DataResource(String dataResourceId, String dataResourceTypeId, String dataCategoryId, String dataResourceName, String dataResourceDescription, String isPublic, Date createdDate, String createdByUserLogin, Date updatedDate, String updatedByUserLogin, String flag, String isDelete, Date createdTime, Date updateTime){
	this.dataResourceId = dataResourceId;
	this.dataResourceTypeId = dataResourceTypeId;
	this.dataCategoryId = dataCategoryId;
	this.dataResourceName = dataResourceName;
	this.dataResourceDescription = dataResourceDescription;
	this.isPublic = isPublic;
	this.createdDate = createdDate;
	this.createdByUserLogin = createdByUserLogin;
	this.updatedDate = updatedDate;
	this.updatedByUserLogin = updatedByUserLogin;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
}

	public String getDataResourceId() {
		return dataResourceId;
	}

	public void setDataResourceId(String dataResourceId) {
		this.dataResourceId = dataResourceId;
	}

	public String getDataResourceTypeId() {
		return dataResourceTypeId;
	}

	public void setDataResourceTypeId(String dataResourceTypeId) {
		this.dataResourceTypeId = dataResourceTypeId;
	}

	public String getDataCategoryId() {
		return dataCategoryId;
	}

	public void setDataCategoryId(String dataCategoryId) {
		this.dataCategoryId = dataCategoryId;
	}

	public String getDataResourceName() {
		return dataResourceName;
	}

	public void setDataResourceName(String dataResourceName) {
		this.dataResourceName = dataResourceName;
	}

	public String getDataResourceDescription() {
		return dataResourceDescription;
	}

	public void setDataResourceDescription(String dataResourceDescription) {
		this.dataResourceDescription = dataResourceDescription;
	}

	public String getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	public void setCreatedByUserLogin(String createdByUserLogin) {
		this.createdByUserLogin = createdByUserLogin;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedByUserLogin() {
		return updatedByUserLogin;
	}

	public void setUpdatedByUserLogin(String updatedByUserLogin) {
		this.updatedByUserLogin = updatedByUserLogin;
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
