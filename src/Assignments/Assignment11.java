package Assignments;

public class Assignment11 {

	public static void main(String[] args) {
		
		int n=5; //number of lines in upper triangle
		//upper triangle
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=n-i;s++)//printing spaces//n-1=spaces should be less then n 
			{
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=i;j++)//printing number 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--)//below triangle 
		{
			for(int s=1;s<=n-i;s++)
			{
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		

	}

}
