package Collection;

import java.util.LinkedList;
import java.util.List;

public class listLinkedList {

	public static void main(String[] args) {
		// Declaring Linked List To add Top 10 Places in India
		List<String> touristPlaces = new LinkedList<String>();

		// Adding Values or Data in Linked List
		touristPlaces.add("Goa");
		touristPlaces.add("Mahableshwar");
		touristPlaces.add("Pondicherry");
		touristPlaces.add("Leh Ladak");
		touristPlaces.add("Darjeeling");
		touristPlaces.add("Tajmahal");
		touristPlaces.add("Gokarna");
		touristPlaces.add("Lonavala");
		touristPlaces.add("Malvan");
		touristPlaces.add("Ooty");

// Printing	Top 10 tourist places in India And Size of LinkedList
		System.out.println("Top ten Best Tourist Places in India :" + touristPlaces);
		System.out.println("Size of the Linked List : " + touristPlaces.size());

	}

}
