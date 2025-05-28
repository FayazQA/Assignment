package Collection;

import java.util.LinkedList;

public class ListTopMovies {

	public static void main(String[] args) {
		
		LinkedList<String> topMovies = new LinkedList<String>();
		topMovies.add("KGf");
		topMovies.add("Pushpa");
		topMovies.add("Bahubali");
		topMovies.add("RRR");
		topMovies.add("Yeh Jawani hai deewani ");
		topMovies.remove(2);
		
		System.out.println(" Top 5 Highest Grossing Movie :"+topMovies);
		System.out.println(" 3rd Highest Grossing Movie :"+topMovies.get(2));
		

		
		
		
		
		
	}

}
