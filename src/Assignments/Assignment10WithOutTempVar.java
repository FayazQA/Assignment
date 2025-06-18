package Assignments;

public class Assignment10WithOutTempVar {

	public static void main(String[] args) {
		
		int[] numbers={ 12, 34, 11, 36, 87, 98, 93 };
		int TempVar;// Temporary variable to store value temporary
		
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]<numbers[j])
				{
					
					// Swapping two numbers using Temporary variable
					TempVar=numbers[i];// storing first value in Temporary variable
					
					numbers[i]=numbers[j];//Now first value is empty then store second value in first Variable 
					
					numbers[j]=TempVar;//Now Second value is empty then store value from Temporary Variable 
					
					
					
				}
				
				
			}
			
		}
		// Printing the second largest number
        System.out.println("Second largest number is :" + numbers[1]);

        // Printing the third largest number
        System.out.println("Third largest number is :" + numbers[2]);

	}

}
