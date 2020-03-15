package com.nikhil.bankCustomerDetails;

import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customer;
	public Branch(String name) {
		super();
		this.name = name;
		this.customer=new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public ArrayList<Customer> getCustomer() {
		return customer;
	}
	public boolean addCustomer(String name,int initialTransaction) {
		if(findCustomer(name)!= null) {
			System.out.println("Customer already exists");
			return false;
		}
		customer.add(new Customer(name,initialTransaction));
		return true;
	}
	
	public boolean removeCustomer(String name) {
		if(findCustomer(name) == null) {
			System.out.println("Customer doesn't exist");
			return false;
		}
		Customer cust=findCustomer(name);
		customer.remove(cust);
		return true;
	}
	
	public boolean addCustomerTransaction(String name,int transaction) {
		Customer existingCustomer= findCustomer(name);
		if(existingCustomer==null) {
			System.out.println("Customer doesn't exist");
			return false;
		}
		
		existingCustomer.addTransaction(transaction);
		return true;
	}
	
	public Customer findCustomer(String name) {
		for(int i=0;i<this.customer.size();i++) {
			Customer c= this.customer.get(i);
			if(c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}
	
	
//	public String toString() {
//			for(Customer c: this.customer) {
//			System.out.println(c.getName());
//		};
//		return "Customers For Branch "+ this.getName();
//	}
	
	
	
}
