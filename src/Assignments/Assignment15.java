package Assignments;

public class Assignment15 {

	//Declaring variable outside the method to use the same variable in all methods
	String sentence = "Java programming is fun and challenging";

	// method for reversing String
	public void reverseString() {

		// Temporary variable to store Reverse string
		String reverseSentense = "";

		
		//for loop to Reverse string 
		//sentence.length() - 1 = Scanning starts from last letter of 
		
		for (int i = sentence.length() - 1; i >= 0; i--) {
			
			//charAt(i) = index of letters in word or Sentence
			reverseSentense = reverseSentense + sentence.charAt(i);

		}

		System.out.println("Reverse Sentence : " + reverseSentense);

	}

	//Method to Count The words
	public void wordsCount() {
		//.Split method is use to split the sentence into separate words
		// adding each word into a Array
		String[] words = sentence.split(" ");
		
		//.length variable use to know number of words in Array
		System.out.println("Count of words in Sentence :" + words.length);

	}

	public void firstLetterUppercase() {
		String[] words = sentence.split(" ");

		StringBuilder capitalizedSentence = new StringBuilder();

		for (String word : words) {
			if (!word.isEmpty()) {

				capitalizedSentence.append(Character.toUpperCase(word.charAt(0)));
				capitalizedSentence.append(word.substring(1));
				capitalizedSentence.append(" ");
			}
		}

		System.out.println("Capitalized Sentence: " + capitalizedSentence.toString().trim());

	}

	public static void main(String[] args) {

		Assignment15 A15 = new Assignment15();
		A15.wordsCount();
		A15.reverseString();
		A15.firstLetterUppercase();

	}

}
