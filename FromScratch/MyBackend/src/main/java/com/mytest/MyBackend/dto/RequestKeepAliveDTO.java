package com.mytest.MyBackend.dto;

import java.io.Serializable;

public class RequestKeepAliveDTO implements Serializable{
	

	private static final long serialVersionUID = 5960426231725652209L;
	private String token;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	

}
