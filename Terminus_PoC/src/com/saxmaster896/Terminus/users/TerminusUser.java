package com.saxmaster896.Terminus.users;

public class TerminusUser {
	private String username;
	private String password;
	boolean isAdmin;
	
	TerminusUser(String username, String password) {
		this.username=username;
		this.password=password;
		isAdmin=false;
	}
	public void loadUserInfo(){
		//queries database for user info to load into mem
		//does this after log in (obviously)
	}
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
}
