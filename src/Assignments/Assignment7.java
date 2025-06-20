package Assignments;

public class Assignment7 {

	public static void main(String[] args) {

		/*
		 * A bank evaluates loan applicants based on the following criteria: 1. Credit
		 * Score: o If the credit score is above 750, the loan is automatically
		 * approved. o If the credit score is between 650 and 750, additional checks are
		 * performed. o If the credit score is below 650, the loan is denied. 2. Income:
		 * o For credit scores between 650 and 750, the customer’s income must be at
		 * least $50,000 for the loan to be considered.
		 * 
		 * 3. Employment Status: o If the customer’s income is at least 50,000, the
		 * system checks whether the customer is employed. o If the customer is
		 * unemployed, the loan is denied. 4. Debt-to-Income Ratio: o If the customer is
		 * employed, the system checks the debt-to-income (DTI) ratio. o If the DTI
		 * ratio is less than 40%, the loan is approved. o If the DTI ratio is 40% or
		 * greater, the loan is denied.
		 * 
		 * Now based on below details, print whether user is eligible to get the loan or
		 * not customerName = "John Doe"; creditScore = 720; income = 55000.0;
		 * isEmployed = true; debtToIncomeRatio = 35.0;
		 */

		// Declaring Variables and Assigning Value of Variable
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 45.0;

		// Conditional Statement if else
		if (creditScore > 750) {
			System.out.println("Loan is Pre-Approved because your Credit Score is greater than 750 ");

		} else if (creditScore < 650) {
			System.out.println("Your Loan is Denied because of your Credit Score is less than 650 ");

		}

		else if (creditScore >= 650 && creditScore <= 750) {
			if (income >= 50000.0 && isEmployed == true && debtToIncomeRatio < 40) {
				System.out.println("Hi " + customerName);
				System.out.println("Your Eligible for Loan ");
			} else {
				System.out.println("Hi " + customerName);
				System.out.println("Your are not Eligible for Loan ");
			}

		}

	}

}
