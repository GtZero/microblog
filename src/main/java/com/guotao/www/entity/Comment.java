package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class Comment implements Serializable {


	private static final long serialVersionUID =  1378275990637409799L;


	/**
	 * 评论编号
	 */
	private String commentId;

	/**
	 * 评论用户编号
	 */
	private String userId;

	/**
	 * 博文编号
	 */
	private String contentId;

	/**
	 * 评论父节点编号
	 */
	private String commentParentId;

	/**
	 * 评论内容
	 */
	private String commentData;

	/**
	 * 点赞数
	 */
	private String vote;

	/**
	 * 是否热门
	 */
	private String isHot;

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

	public  Comment(){};

	public  Comment(String commentId, String userId, String contentId, String commentParentId, String commentData, String vote, String isHot, String flag, String isDelete, Date createdTime, Date updateTime){
	this.commentId = commentId;
	this.userId = userId;
	this.contentId = contentId;
	this.commentParentId = commentParentId;
	this.commentData = commentData;
	this.vote = vote;
	this.isHot = isHot;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getCommentParentId() {
		return commentParentId;
	}

	public void setCommentParentId(String commentParentId) {
		this.commentParentId = commentParentId;
	}

	public String getCommentData() {
		return commentData;
	}

	public void setCommentData(String commentData) {
		this.commentData = commentData;
	}

	public String getVote() {
		return vote;
	}

	public void setVote(String vote) {
		this.vote = vote;
	}

	public String getIsHot() {
		return isHot;
	}

	public void setIsHot(String isHot) {
		this.isHot = isHot;
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
