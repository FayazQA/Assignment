package Assignments;

public class Assignment17 {

	public void starPrinting(int numberOfLines) {
		
		int n=numberOfLines;
		
		for(int i=0;i<=n;i++)//for loop for number of lines or rows
		{
			for(int j=0;j<n-i;j++)// for printing Spaces
			{
				System.out.print(" ");
			}
		
			for(int a=1;a<=i;a++)// for printing stars
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Assignment17 A17= new Assignment17();
		A17.starPrinting(5);
		

	}

}
