package com.kudla.entities;

public class Station_users {


private int id;
private String station_id;
private int user_id;

public Station_users() {

}

public Station_users(int id, String station_id, int user_id) {
super();
this.id = id;
this.station_id = station_id;
this.user_id = user_id;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getStation_id() {
return station_id;
}
public void setStation_id(String station_id) {
this.station_id = station_id;
}
public int getUser_id() {
return user_id;
}
public void setUser_id(int user_id) {
this.user_id = user_id;
}


}