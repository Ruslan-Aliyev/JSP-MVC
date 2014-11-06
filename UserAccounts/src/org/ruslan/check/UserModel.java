package org.ruslan.check;

public class UserModel {
	private String un, pw;
	
	public String getUn(){
		return un;
	}
	public String getPw(){
		return pw;
	}	
	
	public UserModel(String un, String pw){
		this.un=un;
		this.pw=pw;
	}
}
