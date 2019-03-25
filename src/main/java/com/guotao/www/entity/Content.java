package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class Content implements Serializable {


	private static final long serialVersionUID =  1409657662716830311L;


	/**
	 * 博文编码
	 */
	private String contentId;

	/**
	 * 博文作者编号
	 */
	private String contentUserId;

	/**
	 * 博文作者昵称
	 */
	private String contentUserName;

	/**
	 * 博文类型编码
	 */
	private String contentTypeId;

	/**
	 * 博文目的编码
	 */
	private String contentPurposeId;

	/**
	 * 博文标题
	 */
	private String contentTitle;

	/**
	 * 博文封面图片
	 */
	private String displayImage;

	/**
	 * 博文简介
	 */
	private String description;

	/**
	 * 博文内容数据
	 */
	private String contentData;

	/**
	 * 访客数量
	 */
	private String contentNumber;

	/**
	 * 是否为精华
	 */
	private String isEssence;

	/**
	 * 是否置顶
	 */
	private String isTop;

	/**
	 * 是否付费
	 */
	private String isPay;

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

	public  Content(){};

	public  Content(String contentId, String contentUserId, String contentUserName, String contentTypeId, String contentPurposeId, String contentTitle, String displayImage, String description, String contentData, String contentNumber, String isEssence, String isTop, String isPay, String flag, String isDelete, Date createdTime, Date updateTime){
	this.contentId = contentId;
	this.contentUserId = contentUserId;
	this.contentUserName = contentUserName;
	this.contentTypeId = contentTypeId;
	this.contentPurposeId = contentPurposeId;
	this.contentTitle = contentTitle;
	this.displayImage = displayImage;
	this.description = description;
	this.contentData = contentData;
	this.contentNumber = contentNumber;
	this.isEssence = isEssence;
	this.isTop = isTop;
	this.isPay = isPay;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
}

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getContentUserId() {
		return contentUserId;
	}

	public void setContentUserId(String contentUserId) {
		this.contentUserId = contentUserId;
	}

	public String getContentUserName() {
		return contentUserName;
	}

	public void setContentUserName(String contentUserName) {
		this.contentUserName = contentUserName;
	}

	public String getContentTypeId() {
		return contentTypeId;
	}

	public void setContentTypeId(String contentTypeId) {
		this.contentTypeId = contentTypeId;
	}

	public String getContentPurposeId() {
		return contentPurposeId;
	}

	public void setContentPurposeId(String contentPurposeId) {
		this.contentPurposeId = contentPurposeId;
	}

	public String getContentTitle() {
		return contentTitle;
	}

	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}

	public String getDisplayImage() {
		return displayImage;
	}

	public void setDisplayImage(String displayImage) {
		this.displayImage = displayImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContentData() {
		return contentData;
	}

	public void setContentData(String contentData) {
		this.contentData = contentData;
	}

	public String getContentNumber() {
		return contentNumber;
	}

	public void setContentNumber(String contentNumber) {
		this.contentNumber = contentNumber;
	}

	public String getIsEssence() {
		return isEssence;
	}

	public void setIsEssence(String isEssence) {
		this.isEssence = isEssence;
	}

	public String getIsTop() {
		return isTop;
	}

	public void setIsTop(String isTop) {
		this.isTop = isTop;
	}

	public String getIsPay() {
		return isPay;
	}

	public void setIsPay(String isPay) {
		this.isPay = isPay;
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
