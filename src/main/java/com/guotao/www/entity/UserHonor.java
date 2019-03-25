package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class UserHonor implements Serializable {


	private static final long serialVersionUID =  6041981294809180995L;


	/**
	 * 用户编号
	 */
	private String userId;

	/**
	 * 用户当前经验值
	 */
	private String userExperience;

	/**
	 * 头衔编号
	 */
	private String honorId;

	/**
	 * 头衔名称
	 */
	private String honorName;

	/**
	 * 下一个头衔编号
	 */
	private String honorNextId;

	/**
	 * 下一个头衔名称
	 */
	private String honorNextName;

	/**
	 * 下一个头衔的经验值
	 */
	private String honorNextExperience;

	/**
	 * 开始日期
	 */
	private Date fromDate;

	/**
	 * 截至日期
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

	public  UserHonor(){};

	public  UserHonor(String userId, String userExperience, String honorId, String honorName, String honorNextId, String honorNextName, String honorNextExperience, Date fromDate, Date thruDate, String flag, String isDelete, Date createdTime, Date updateTime){
	this.userId = userId;
	this.userExperience = userExperience;
	this.honorId = honorId;
	this.honorName = honorName;
	this.honorNextId = honorNextId;
	this.honorNextName = honorNextName;
	this.honorNextExperience = honorNextExperience;
	this.fromDate = fromDate;
	this.thruDate = thruDate;
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

	public String getUserExperience() {
		return userExperience;
	}

	public void setUserExperience(String userExperience) {
		this.userExperience = userExperience;
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

	public String getHonorNextId() {
		return honorNextId;
	}

	public void setHonorNextId(String honorNextId) {
		this.honorNextId = honorNextId;
	}

	public String getHonorNextName() {
		return honorNextName;
	}

	public void setHonorNextName(String honorNextName) {
		this.honorNextName = honorNextName;
	}

	public String getHonorNextExperience() {
		return honorNextExperience;
	}

	public void setHonorNextExperience(String honorNextExperience) {
		this.honorNextExperience = honorNextExperience;
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
