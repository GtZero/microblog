package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class DataResourceType implements Serializable {


	private static final long serialVersionUID =  2848419853252635446L;


	/**
	 * 数据资源类型编码
	 */
	private String dataResouceTypeId;

	/**
	 * 父类型编码
	 */
	private String parentTypeId;

	/**
	 * 拓展后缀
	 */
	private String extend;

	/**
	 * 描述
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

	public  DataResourceType(){};

	public  DataResourceType(String dataResouceTypeId, String parentTypeId, String extend, String description, String flag, String isDelete, Date createdTime, Date updateTime){
	this.dataResouceTypeId = dataResouceTypeId;
	this.parentTypeId = parentTypeId;
	this.extend = extend;
	this.description = description;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
}

	public String getDataResouceTypeId() {
		return dataResouceTypeId;
	}

	public void setDataResouceTypeId(String dataResouceTypeId) {
		this.dataResouceTypeId = dataResouceTypeId;
	}

	public String getParentTypeId() {
		return parentTypeId;
	}

	public void setParentTypeId(String parentTypeId) {
		this.parentTypeId = parentTypeId;
	}

	public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
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
