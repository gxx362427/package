package org.great.bean;

public class User {
	
	private Integer tbuid;
	private String tbuname;
	
	
	public User() {
		super();
	}


	public User(Integer tbuid, String tbuname) {
		super();
		this.tbuid = tbuid;
		this.tbuname = tbuname;
	}


	public Integer getTbuid() {
		return tbuid;
	}


	public void setTbuid(Integer tbuid) {
		this.tbuid = tbuid;
	}


	public String getTbuname() {
		return tbuname;
	}


	public void setTbuname(String tbuname) {
		this.tbuname = tbuname;
	}
	

}
