package com.dance.dto;

import java.io.Serializable;

public class Avatar implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9071308506135918450L;
	
	private int avatar_id;
	private String img;
	
	
	public Avatar() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Avatar(int avatar_id, String img) {
		super();
		this.avatar_id = avatar_id;
		this.img = img;
	}


	public int getAvatar_id() {
		return avatar_id;
	}


	public void setAvatar_id(int avatar_id) {
		this.avatar_id = avatar_id;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Avatar [avatar_id=" + avatar_id + ", img=" + img + "]";
	}


}
