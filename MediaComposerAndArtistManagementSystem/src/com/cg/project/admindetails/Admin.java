package com.cg.project.admindetails;

public class Admin {
	private String AdminId;
	private String password;
	public Admin(String adminId, String password) {
		super();
		AdminId = adminId;
		this.password = password;
	}
	public String getAdminId() {
		return AdminId;
	}
	public void setAdminId(String adminId) {
		AdminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
