package com.nikhil.bankCustomerDetails;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Integer> transactions;
	public Customer(String name,int initialTransaction) {
		super();
		this.name = name;
		this.transactions=new ArrayList<>();
		transactions.add(initialTransaction);
	}
	public String getName() {
		return name;
	}
	public ArrayList<Integer> getTransactions() {
		return transactions;
	}
	public void addTransaction(int transaction) {
		transactions.add(transaction);
		return;
	}
	

	

}
