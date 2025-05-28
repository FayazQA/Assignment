package Collection;

import java.util.ArrayList;
import java.util.List;

public class listArrayList {

	public static void main(String[] args) {
		// Declaring Array List To add 10 Numbers
		List<Integer> numbers = new ArrayList<Integer>();

		// Adding Values in Array list
		numbers.add(10);
		numbers.add(30);
		numbers.add(null);
		numbers.add(10);
		numbers.add(70);
		numbers.add(50);
		numbers.add(300);
		numbers.add(400);
		numbers.add(200);
		numbers.add(800);

		// Calculating Average of 5th and 6th value in Array list
		int Average = (numbers.get(5) + numbers.get(6)) / 2;

		// Printing numbers in array list and average of 5th,6th number
		System.out.println(numbers);
		System.out.println("Average of 5th and 6th number from ArrayList :" + Average);

	}

}
