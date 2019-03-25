package com.guotao.www.entity;

import java.io.Serializable;
import java.util.Date;


public class ImageDataResource implements Serializable {


	private static final long serialVersionUID =  6086356355735314639L;


	/**
	 * 数据资源编码
	 */
	private String dataResourceId;

	/**
	 * 图片数据URL
	 */
	private String imageData;

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

	public  ImageDataResource(){};

	public  ImageDataResource(String dataResourceId, String imageData, String flag, String isDelete, Date createdTime, Date updateTime){
	this.dataResourceId = dataResourceId;
	this.imageData = imageData;
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

	public String getImageData() {
		return imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
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
