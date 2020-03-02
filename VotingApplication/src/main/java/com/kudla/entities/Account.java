package com.kudla.entities;

public class Account {
     private String username;
     private String password;
     private String account_type;
     private int userid;
     
    public Account() {
    	
    }
    
public Account(String username, String password, String account_type, int userid) {
super();
this.username = username;
this.password = password;
this.account_type = account_type;
this.userid = userid;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public String getAccount_type() {
return account_type;
}
public void setAccount_type(String account_type) {
this.account_type = account_type;
}
public int getUserid() {
return userid;
}
public void setUserid(int userid) {
this.userid = userid;
}
     
     
}
