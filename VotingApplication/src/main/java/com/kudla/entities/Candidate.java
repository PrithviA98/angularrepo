package com.kudla.entities;

public class Candidate {
   private int userid;
   private String party;
   private String area;
   private double votes;
   private int rank;


   public Candidate(){
   
   }
     
public Candidate(int userid, String party, String area, double votes, int rank) {
super();
this.userid = userid;
this.party = party;
this.area = area;
this.votes = votes;
this.rank = rank;
}
public int getUserid() {
return userid;
}
public void setUserid(int userid) {
this.userid = userid;
}
public String getParty() {
return party;
}
public void setParty(String party) {
this.party = party;
}
public String getArea() {
return area;
}
public void setArea(String area) {
this.area = area;
}
public double getVotes() {
return votes;
}
public void setVotes(double votes) {
this.votes = votes;
}
public int getRank() {
return rank;
}
public void setRank(int rank) {
this.rank = rank;
}
   
   
}