package com.nikhil.bankCustomerDetails;

public class BankMain {

	public static void main(String[] args) {
		
//		Branch ctr=new Branch("Chittoor");
//		ctr.addCustomer("nikhil", 10000);
//		ctr.addCustomerTransaction("nikhil", 100);
//		
//		ctr.addCustomer("yoyo", 3000);
//		ctr.addCustomer("hap", 4000);
//		ctr.addCustomer("chap", 500);
//		
//		ctr.addCustomerTransaction("chap", 9000);
//		ctr.addCustomerTransaction("nani", 8976);
//		System.out.println(ctr);

		Bank idfc=new Bank("IDFC");
		idfc.addBranch("bangalore");
		idfc.addBranch("ctr");
		idfc.addCustomer("bangalore", "nikhil", 10000);
		idfc.addCustomer("bangalore", "ching", 2000);
		
		idfc.addCustomer("ctr", "nani", 29000);
		idfc.addCustomer("ctr", "yupp", 100);
		
		idfc.addCustomerTransaction("bangalore", "nikhil", 89000);
		idfc.addCustomerTransaction("bangalore", "nikhil", 9000);
		idfc.addCustomerTransaction("bangalore", "nikhil", 200);
		idfc.addCustomerTransaction("bangalore", "ching", 1000);
		
		idfc.addCustomerTransaction("ctr", "nani", 800);
		idfc.addCustomerTransaction("ctr", "nani", 1800);
		idfc.addCustomerTransaction("ctr", "nani", 150);
		idfc.addCustomerTransaction("ctr", "yup", 800);  //Customer doesn't exist
		idfc.addCustomerTransaction("ctr", "ching", 800); //Customer doesn't exist
		
		idfc.addCustomer("ctr", "nani", 890);  //Customer already exists
		idfc.addCustomer("chittoor", "nani", 29000); //branch doesn't exist
		
		
		
		
	}

}
