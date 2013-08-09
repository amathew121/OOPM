/*
 * 
 * Write a program to create a class Account with data members 
 * customer-ID, customer-name, account-no, account-type (saving and 
 * current) and balance. Write methods get-Account() to take input 
 * from users and display-Account() to show account details. [10m]
 * 
 */

import java.io.*;

public class May2013Q7 {
	
	public static void main (String args[]) throws IOException {
		Account a = new Account();
		a.getDetails();
		a.displayDetails();
	}
}

class Account {
	private int customerID;
	private String customerName;
	private int accountID;
	private int accountType;
	private double balance;
	
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	public void getDetails() throws IOException {
		System.out.println("Please Enter Details");		
		System.out.println("Customer ID : \t");
		customerID = Integer.parseInt(br.readLine());
		System.out.println("Customer Name : \t");
		customerName = br.readLine();
		System.out.println("Account ID  : \t");
		accountID = Integer.parseInt(br.readLine());
		System.out.println("Account Type : \t");
		System.out.println("Press 1 for Savings : \t");		
		System.out.println("Press 2 for Current : \t");		
		accountType = Integer.parseInt(br.readLine());
		System.out.println("Balance : \t");
		balance = Double.parseDouble(br.readLine());
	}	
	public void displayDetails() {
		System.out.println("Details of the Account");		
		System.out.println("Customer ID : \t" + customerID);
		System.out.println("Customer Name: \t" + customerName);
		System.out.println("Account ID : \t" + accountID);
		if(accountType == 1 )
			System.out.println("Account Type : \tSavings");
		else
			System.out.println("Account Type : \tCurrent");
		System.out.println("Balance : \t" + balance);
	}
}

/*
 *  
 * Output:
 * 
 * Please Enter Details 
 * Customer ID :  
 * 1234 
 * Customer Name :  
 * Rajkumar 
 * Account ID  :  
 * 1650000343 
 * Account Type :  
 * Press 1 for Savings :  
 * Press 2 for Current :  
 * 1 
 * Balance :  
 * 35000.56 
 * 
 * Details of the Account 
 * Customer ID :   1234 
 * Customer Name:  Rajkumar 
 * Account ID :    1650000343 
 * Account Type :  Savings 
 * Balance :       35000.56 
 * 
 * 
 */
