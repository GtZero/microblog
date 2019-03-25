package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class Honor implements Serializable {


	private static final long serialVersionUID =  8369562849734684532L;


	/**
	 * 头衔编号
	 */
	private String honorId;

	/**
	 * 头衔名称
	 */
	private String honorName;

	/**
	 * 头衔图标
	 */
	private String honorImage;

	/**
	 * 头衔标识
	 */
	private String honorIdentify;

	/**
	 * 头衔经验值
	 */
	private String honorExperience;

	/**
	 * 下一个头衔编号
	 */
	private String honorNextId;

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

	public  Honor(){};

	public  Honor(String honorId, String honorName, String honorImage, String honorIdentify, String honorExperience, String honorNextId, String flag, String isDelete, Date createdTime, Date updateTime){
	this.honorId = honorId;
	this.honorName = honorName;
	this.honorImage = honorImage;
	this.honorIdentify = honorIdentify;
	this.honorExperience = honorExperience;
	this.honorNextId = honorNextId;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
}

	public String getHonorId() {
		return honorId;
	}

	public void setHonorId(String honorId) {
		this.honorId = honorId;
	}

	public String getHonorName() {
		return honorName;
	}

	public void setHonorName(String honorName) {
		this.honorName = honorName;
	}

	public String getHonorImage() {
		return honorImage;
	}

	public void setHonorImage(String honorImage) {
		this.honorImage = honorImage;
	}

	public String getHonorIdentify() {
		return honorIdentify;
	}

	public void setHonorIdentify(String honorIdentify) {
		this.honorIdentify = honorIdentify;
	}

	public String getHonorExperience() {
		return honorExperience;
	}

	public void setHonorExperience(String honorExperience) {
		this.honorExperience = honorExperience;
	}

	public String getHonorNextId() {
		return honorNextId;
	}

	public void setHonorNextId(String honorNextId) {
		this.honorNextId = honorNextId;
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
