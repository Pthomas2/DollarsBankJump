package com.dollarsBank.model;

import java.util.ArrayList;

public class Account {
	
	private Long acctId;
	
	private Long mbrId;
	
	private double balance;
	
	private ArrayList<String> transactions;
	
	public Account(Long acctId, Long mbrId, double balance) {
		super();
		this.acctId = acctId;
		this.mbrId = mbrId;
		this.balance = balance;
	}
	
	

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		

	}


	public Long getAcctId() {
		return acctId;
	}

	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}

	public Long getMbrId() {
		return mbrId;
	}

	public void setMbrId(Long mbrId) {
		this.mbrId = mbrId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}



	public ArrayList<String> getTransactions() {
		return transactions;
	}



	public void setTransactions(ArrayList<String> transactions) {
		this.transactions = transactions;
	}
	
	



}
