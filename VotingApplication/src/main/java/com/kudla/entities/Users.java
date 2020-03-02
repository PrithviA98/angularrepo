package com.kudla.entities;

import java.sql.Date;

public class Users {

private int userid;
private String name;
private String address;
private String aadhar;
private String stationid;
private String gender;
private Date dob;
private String image;


public Users(){

}


public Users(int userid, String name, String address, String aadhar, String stationid, String gender, Date dob,String image) {
super();
this.userid = userid;
this.name = name;
this.address = address;
this.aadhar = aadhar;
this.stationid = stationid;
this.gender = gender;
this.dob = dob;
this.image = image;
}

public int getUserid() {
return userid;
}
public void setUserid(int userid) {
this.userid = userid;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public String getAadhar() {
return aadhar;
}
public void setAadhar(String aadhar) {
this.aadhar = aadhar;
}
public String getStationid() {
return stationid;
}
public void setStationid(String stationid) {
this.stationid = stationid;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public Date getDob() {
return dob;
}
public void setDob(Date dob) {
this.dob = dob;
}
public String getImage() {
return image;
}
public void setImage(String image) {
this.image = image;
}


}