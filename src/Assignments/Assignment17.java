package Assignments;

public class Assignment17 {

	public void starPrinting(int numberOfLines) {

		int n = numberOfLines;

		for (int i = 1; i <= n; i++)// for loop for number of lines or rows
		{
			for (int j = i; j < n; j++)// for printing Spaces
			{
				System.out.print(" ");
			}

			for (int a = 1; a <= i; a++)// for printing stars
			{
				System.out.print("*");
			}

			System.out.println();// to goto next Line
		}

	}

	public static void main(String[] args) {

		Assignment17 A17 = new Assignment17();
		A17.starPrinting(5);

	}

}
