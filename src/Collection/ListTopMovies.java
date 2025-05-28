package Collection;

import java.util.LinkedList;

public class ListTopMovies {

	public static void main(String[] args) {

		// Declaring Linked List To add Data of Top 5 Highest grossing movies
		LinkedList<String> topMovies = new LinkedList<String>();

		// Adding Movies in LinkedList
		topMovies.add("KGf");
		topMovies.add("Pushpa");
		topMovies.add("Bahubali");
		topMovies.add("RRR");
		topMovies.add("Yeh Jawani hai deewani ");
		topMovies.remove(2);

		// Printing Top 5 Highest Grossing Movies And 3rd Highest Grossing Movie
		System.out.println(" Top 5 Highest Grossing Movies :" + topMovies);
		System.out.println(" 3rd Highest Grossing Movie :" + topMovies.get(2));

	}

}
