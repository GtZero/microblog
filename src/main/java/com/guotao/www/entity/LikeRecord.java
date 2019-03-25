package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class LikeRecord implements Serializable {


	private static final long serialVersionUID =  255151019705177786L;


	/**
	 * 点赞记录编号
	 */
	private String likeId;

	/**
	 * 博文/评论/回复编号
	 */
	private String toLikeId;

	/**
	 * 1表示博文，2表示评论
	 */
	private String likeType;

	/**
	 * 点赞人编号
	 */
	private String userId;

	/**
	 * 点赞状态
	 */
	private String likeStatus;

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

	public  LikeRecord(){};

	public  LikeRecord(String likeId, String toLikeId, String likeType, String userId, String likeStatus, String flag, String isDelete, Date createdTime, Date updateTime){
	this.likeId = likeId;
	this.toLikeId = toLikeId;
	this.likeType = likeType;
	this.userId = userId;
	this.likeStatus = likeStatus;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
}

	public String getLikeId() {
		return likeId;
	}

	public void setLikeId(String likeId) {
		this.likeId = likeId;
	}

	public String getToLikeId() {
		return toLikeId;
	}

	public void setToLikeId(String toLikeId) {
		this.toLikeId = toLikeId;
	}

	public String getLikeType() {
		return likeType;
	}

	public void setLikeType(String likeType) {
		this.likeType = likeType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLikeStatus() {
		return likeStatus;
	}

	public void setLikeStatus(String likeStatus) {
		this.likeStatus = likeStatus;
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
