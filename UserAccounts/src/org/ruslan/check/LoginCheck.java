package org.ruslan.check;

import java.util.ArrayList;

public class LoginCheck {
	
	ArrayList<UserModel> validPeople = new ArrayList<UserModel>();
	
	public LoginCheck(){
		UserModel customer1=new UserModel("Nikolai", "aaa");
		UserModel customer2=new UserModel("Mustafa", "bbb");
		UserModel customer3=new UserModel("Timorlang", "ccc");
		
		validPeople.add(customer1);
		validPeople.add(customer2);
		validPeople.add(customer3);
	}
	
	public String checkUser(String un, String pw){
		for (int i = 0; i < validPeople.size(); i++) {
			UserModel currentUser = validPeople.get(i);
		    if(currentUser.getUn().equals(un) && currentUser.getPw().equals(pw)){
		    	return currentUser.getUn();
		    }
		}
		return "";
	}		
}
