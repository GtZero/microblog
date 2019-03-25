package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class ContentPay implements Serializable {


	private static final long serialVersionUID =  6061865776513387351L;


	/**
	 * 博文付费编号
	 */
	private String contentPayId;

	/**
	 * 作者编号
	 */
	private String userId;

	/**
	 * 博文编号
	 */
	private String contentId;

	/**
	 * 博文价格
	 */
	private String contentPayPrice;

	/**
	 * 会员是否可以直接查看
	 */
	private String contentVip;

	/**
	 * 付款二维码
	 */
	private String payUrl;

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

	public  ContentPay(){};

	public  ContentPay(String contentPayId, String userId, String contentId, String contentPayPrice, String contentVip, String payUrl, String flag, String isDelete, Date createdTime, Date updateTime){
	this.contentPayId = contentPayId;
	this.userId = userId;
	this.contentId = contentId;
	this.contentPayPrice = contentPayPrice;
	this.contentVip = contentVip;
	this.payUrl = payUrl;
	this.flag = flag;
	this.isDelete = isDelete;
	this.createdTime = createdTime;
	this.updateTime = updateTime;
}

	public String getContentPayId() {
		return contentPayId;
	}

	public void setContentPayId(String contentPayId) {
		this.contentPayId = contentPayId;
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

	public String getContentPayPrice() {
		return contentPayPrice;
	}

	public void setContentPayPrice(String contentPayPrice) {
		this.contentPayPrice = contentPayPrice;
	}

	public String getContentVip() {
		return contentVip;
	}

	public void setContentVip(String contentVip) {
		this.contentVip = contentVip;
	}

	public String getPayUrl() {
		return payUrl;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
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
