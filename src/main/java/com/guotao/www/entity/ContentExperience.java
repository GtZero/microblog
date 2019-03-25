package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class ContentExperience implements Serializable {


	private static final long serialVersionUID =  7512773351816122900L;


	/**
	 * 经验类型编号
	 */
	private String experienceId;

	/**
	 * 经验名称
	 */
	private String experienceName;

	/**
	 * 经验值
	 */
	private String experienceCount;

	/**
	 * 访客数要求
	 */
	private String experienceRequired;

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

	public  ContentExperience(){};

	public  ContentExperience(String experienceId, String experienceName, String experienceCount, String experienceRequired, String flag, String isDelete, Date createdTime, Date updateTime){
	this.experienceId = experienceId;
	this.experienceName = experienceName;
	this.experienceCount = experienceCount;
	this.experienceRequired = experienceRequired;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
}

	public String getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(String experienceId) {
		this.experienceId = experienceId;
	}

	public String getExperienceName() {
		return experienceName;
	}

	public void setExperienceName(String experienceName) {
		this.experienceName = experienceName;
	}

	public String getExperienceCount() {
		return experienceCount;
	}

	public void setExperienceCount(String experienceCount) {
		this.experienceCount = experienceCount;
	}

	public String getExperienceRequired() {
		return experienceRequired;
	}

	public void setExperienceRequired(String experienceRequired) {
		this.experienceRequired = experienceRequired;
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
