package Assignments;

public class Assignment10withTempVar {

	public static void main(String[] args) {

		// Declaring and Initializing values in array
		int[] numberList = { 12, 34, 11, 36, 87, 98, 93 };

		// for loop for loading each value as per insertion Order
		for (int i = 0; i < numberList.length; i++) {
			// for loop for comparing second value with first value
			for (int j = i + 1; j < numberList.length; j++) {
				// condition if 2nd value is greater than 1st values
				if (numberList[i] < numberList[j]) {

					// A = A + B
					numberList[i] = numberList[i] + numberList[j];

					// B = A - B
					numberList[j] = numberList[i] - numberList[j];

					// A = A - B
					numberList[i] = numberList[i] - numberList[j];
				}

			}

		}

		System.out.println("Second Largest Number in The List :" + numberList[1]);
		System.out.println("Third Largest Number in The List  :" + numberList[2]);

	}

}
