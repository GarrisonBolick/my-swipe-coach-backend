package com.baeldung.persistence.model;




public class LoginInfo {
public String email;
public String password;
public LoginInfo(String email, String password) {
	
	this.email = email;
	this.password = password;
}
public LoginInfo() {
	
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

    

}