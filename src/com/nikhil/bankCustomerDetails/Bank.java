package com.nikhil.bankCustomerDetails;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name=name;
		this.branches=new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public boolean addBranch(String name) {
		if(findBranch(name)!=null) {
			System.out.println("Branch exists already");
			return false;
		}
		this.branches.add(new Branch(name));
		return true;
	}
	
	public boolean removeBranch(String name) {
		if(findBranch(name) == null) {
			System.out.println("Branch doesn't exist");
			return false;
		}
		Branch branch=findBranch(name);
		branches.remove(branch);
		return true;
	}
	
	public boolean addCustomer(String branchName,String custName,int initialTransaction) {
		Branch existingBranch=findBranch(branchName);
		if(existingBranch==null) {
			System.out.println("Branch doesn't exist");
			return false;
		}
		existingBranch.addCustomer(custName,initialTransaction);
		return true;
	}
	
	public boolean addCustomerTransaction(String branchName,String CustomerName,int transaction) {
		Branch existingBranch= findBranch(branchName);
		if(existingBranch==null) {
			System.out.println("Branch doesn't exist");
			return false;
		} 
		return existingBranch.addCustomerTransaction(CustomerName,transaction);
	}
	public Branch findBranch(String name) {
		for(int i=0;i<branches.size();i++) {
			Branch b=branches.get(i);
			if(b.getName().equals(name)){
				return b;
			}
		}
		return null;
	}
	
	public boolean listCustomers(String branchName,boolean showTransactions) {
		Branch branch=findBranch(branchName);
		if(branch!=null) {
		System.out.println("Branch Name "+branch.getName() +"\n");
		ArrayList<Customer> branchCustomers=branch.getCustomer();
		for(int i=0;i<branchCustomers.size();i++) {
			Customer c=branchCustomers.get(i);
			System.out.println("Customer :"+c.getName());
			if(showTransactions) {
				System.out.println("Transactions");
				ArrayList<Integer> transactions=c.getTransactions();
				for(int j=0;j<transactions.size();j++) {
					System.out.println("Amount "+ transactions.get(j));
				}
			}
		}
		return true;
		}
		return false;
	}
	
	
}