package com.guotao.www.entity;

import java.io.Serializable;


public class Friend implements Serializable {


	private static final long serialVersionUID =  8371340584490827308L;


	/**
	 * 用户编号
	 */
	private String userId;

	/**
	 * 朋友编号
	 */
	private String friendId;

	/**
	 * 关注状态
	 */
	private String status;

	public  Friend(){};

	public  Friend(String userId, String friendId, String status){
	this.userId = userId;
	this.friendId = friendId;
	this.status = status;
}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFriendId() {
		return friendId;
	}

	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
