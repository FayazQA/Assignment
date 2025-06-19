package Assignments;

public class Assigment16 {

	public static void main(String[] args) {

		String paragraph = "Java is a popular programming language. Java is used for web Adevelopment, mobile applications, and more.";
		
		int count=0;
		String [] words = paragraph.split(" ");
	
		for(int i=0;i<=words.length;i++)
		{
			if(words.equals("Java"))
			{
				int Index = paragraph.indexOf(i);
				count+=1;
				System.out.println(Index);
			}
			
		}
		
		System.out.println(count);
		
	}

}
