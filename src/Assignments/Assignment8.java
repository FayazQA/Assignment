package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8 {

	public static void main(String[] args) {

		/*
		 * Bank Transactions Positive value refers Credit and Negative refers Debit
		 * Transaction Transactions Amount 1 50000 2 -2000 3 3000 4 -15000 5 -200 6 -300
		 * 7 4000 8 -3000 First Store all the transactions in any data structure of Your
		 * Choice from collections, and by using Loops and conditional statements 1.
		 * Print total number of credit and debt transactions completed 2. Print the
		 * total amount credited and debated in account 3. Print total amount remaining
		 * at the end in Bank Account 4. If any transaction limit exceeds +/- 10000 then
		 * print the message “Suspicious credit/ debt Transaction with Amount” and also
		 * print total number of suspicious transactions
		 */

		
		//Declaring Array list to all transaction and adding all Transactions in one list
		List<Integer> transactions = new ArrayList<Integer>();
		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);
		
		
		
		int numberOfCreditedTransaction = 0;
		int numberOfDebitedTransaction = 0;
		int totalAmountCredited = 0;
		int totalAmountDebited = 0;
		int suspiciousTransaction = 0;
		
		for(int amount : transactions)// for each loop to compare each transaction in List with variable 
		{
			if(amount>0) {
				numberOfCreditedTransaction++; // increment of Credited transaction if amount is positive 
				totalAmountCredited +=amount; // adding all credited transaction in Total credited Amount
				if (amount > 10000) 
				{
					System.out.println("Suspicious credit Transaction with Amount :"+amount );
					suspiciousTransaction++;// increment of Suspicious Credited transaction if amount is greater than 10000
				}
			}
			else if(amount<0)
			{
				numberOfDebitedTransaction++;
				totalAmountDebited += amount;
				if (amount < -10000)
				{
					System.out.println("Suspicious credit Transaction with Amount :"+amount );
					suspiciousTransaction++;// increment of Suspicious Debited transaction if amount is less than 10000
				}
			}
		}
		
		 
	        System.out.println("Total number of credit transactions: " + numberOfCreditedTransaction);
	        System.out.println("Total number of debit transactions: " + numberOfDebitedTransaction);
	        System.out.println("Total credited amount: " + totalAmountCredited);
	        System.out.println("Total debited amount: " + totalAmountDebited);
	        System.out.println("Final account balance: " + (totalAmountCredited + totalAmountDebited));
	        System.out.println("Total number of suspicious transactions: " + suspiciousTransaction);
		
		

	}

}
