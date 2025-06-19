package Assignments;

public class Assignment18 {

	public void palindrome(String s) {
		String sentence = s;
		// "A man, a plan, a canal: Panama"
		sentence = sentence.toLowerCase();// converting All characters into Lower Case
		sentence = sentence.replaceAll("[^a-z]", "");// removing all spaces and special using replaceAll method

		// Logic of Palindrome = if Given string and reverse of that string is same then
		// its a palindrome;

		String reverSentence = "";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverSentence = reverSentence + sentence.charAt(i);

		}

		// comparing given String and Reverse String is same or not
		if (sentence.equals(reverSentence)) {
			// if both strings are equal it will Print This.
			System.out.println(sentence + " is Palindrome");
		} else {
			// if both strings are not equal it will Print This
			System.out.println(sentence + " is not Palindrome");
		}

	}

	public static void main(String[] args) {
		Assignment18 A18 = new Assignment18();
		A18.palindrome("race a car");

	}

}
