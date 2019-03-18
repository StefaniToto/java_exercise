package com.mytest.MyBackend.dto;

import java.io.Serializable;

public class ConfGenDTO implements Serializable {


	private static final long serialVersionUID = -5608517160852625743L;
	private String t_codice;
	private String t_valore;
	public String getT_codice() {
		return t_codice;
	}
	public void setT_codice(String t_codice) {
		this.t_codice = t_codice;
	}
	public String getT_valore() {
		return t_valore;
	}
	public void setT_valore(String t_valore) {
		this.t_valore = t_valore;
	}
	
	
	
	
}
