package com.starbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "accounts")
public class Account {
	@Id
	@GeneratedValue

	@Column(name="accno")
	private Long accNo;
	
	@Column(name="ownername")
	private String ownerName;
	
	@Column(name="balance")
	private double balance;

	public Account(Long accNo, String ownerName, double balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public Account() {
		super();
	}

	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public String getownerName() {
		return ownerName;
	}

	public void setownerNamee(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
