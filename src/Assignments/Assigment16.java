package Assignments;

public class Assigment16 {

	public static void main(String[] args) {

		String paragraph = "Java is a popular programming language. Java is used for web Adevelopment, mobile applications, and more.";

		int count = 0;// dummy count variable to store occurrence of Java word
		String[] words = paragraph.split(" ");// Splitting characters into separate words

		for (int i = 0; i < words.length; i++) {
			String word = words[i].replaceAll("[^a-zA-Z]", "");// removing all special characters using replaceAll()
																// Method
			if (word.equalsIgnoreCase("Java"))// comparing each word with "Java"
			// If word is equal to java then it will enter in this if condition
			// and It will print index of the word,also count of occurrence will increase
			{
				System.out.println("Index of java Word :" + i);
				count++;
			}

		}
		System.out.println("Count java Word occurance is :" + count);

	}

}
