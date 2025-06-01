package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment6 {

	public static void main(String[] args) {
		
		/*
		 * 1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		 * marks [75, 80, 82] Add 10 marks to each students using assignment operators
		 * and store it into another array, after adding 10 marks identify the average
		 * marks of all students
		 * 
		 * Expected Output: Updated Marks:
		 *  Suresh: 85
		 *  Mahesh: 90 
		 *  Naresh: 92  
		 *  Average Marks: 89.0
		 */

		// Declaring Map of String And Integer to store Marks
		// Where String is Key And Integer is Value
		Map<String, Integer> studentarks = new HashMap<String, Integer>();
		studentarks.put("Suresh", 75);
		studentarks.put("Mahesh", 80);
		studentarks.put("Naresh", 82);

		// Printing Previous marks of students
		System.out.println("Previous Marks of Students");
		System.out.println("Suresh :" + studentarks.get("Suresh"));
		System.out.println("Mahesh :" + studentarks.get("Mahesh"));
		System.out.println("Naresh :" + studentarks.get("Naresh"));
		System.out.println();

		// Updating Previous marks of students
		int sureshMarks = studentarks.get("Suresh") + 10;
		int maheshMarks = studentarks.get("Mahesh") + 10;
		int nareshMarks = studentarks.get("Naresh") + 10;

		// Calculating average of student marks
		// Converting Integer into Float to get result in Float
		float averageMarks = (float) ((sureshMarks + maheshMarks + nareshMarks) / 3);

		// Printing the Result
		System.out.println("Updated Marks of Students");
		System.out.println("Suresh :" + sureshMarks);
		System.out.println("Mahesh :" + maheshMarks);
		System.out.println("Naresh :" + nareshMarks);
		System.out.println("Average Marks  :" + averageMarks);
	}

}
