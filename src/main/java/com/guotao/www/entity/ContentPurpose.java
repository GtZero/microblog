package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class ContentPurpose implements Serializable {


	private static final long serialVersionUID =  9063439753739888347L;


	/**
	 * 博文目的编码
	 */
	private String contentPurposeId;

	/**
	 * 父博文目的编码
	 */
	private String parentPurposeId;

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

	public  ContentPurpose(){};

	public  ContentPurpose(String contentPurposeId, String parentPurposeId, String description, String flag, String isDelete, Date createdTime, Date updateTime){
	this.contentPurposeId = contentPurposeId;
	this.parentPurposeId = parentPurposeId;
	this.description = description;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
}

	public String getContentPurposeId() {
		return contentPurposeId;
	}

	public void setContentPurposeId(String contentPurposeId) {
		this.contentPurposeId = contentPurposeId;
	}

	public String getParentPurposeId() {
		return parentPurposeId;
	}

	public void setParentPurposeId(String parentPurposeId) {
		this.parentPurposeId = parentPurposeId;
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
