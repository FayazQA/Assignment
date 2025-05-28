package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listCollection {
	public static void main(String[] args) {

		// Declaring ArrayList
		List<String> cityName = new ArrayList<String>();

		// Adding Data in ArrayList
		cityName.add("Delhi");
		cityName.add("Hyderabad");
		cityName.add("Banglore");
		cityName.add("Mumbai");
		cityName.add("Pune");

		// Printing Names of cities and Size of ArrayList
		System.out.println("Size of ArrayList having City Names : " + cityName.size());
		System.out.println("Names of Cities : " + cityName);

		// Declaring LinkedList
		List<Integer> cityArea = new LinkedList<Integer>();
		System.out.println("Area of above cities in cubic meter");
		cityArea.add(20347);
		cityArea.add(33456);
		cityArea.add(75435);
		cityArea.add(22346);
		cityArea.add(90600);
		cityArea.remove(3); // removed value at index 3 from list now the value on index
							// 3 is removed and the next value will be considered

//		Calculating Area of 3rd and 4th cities by adding there Area
		int combinedAreaOfCites = cityArea.get(2) + cityArea.get(3);

		System.out.println("Combined Area of both 3rd and 4th cities in cubic meter :  " + combinedAreaOfCites);

	}

}
