package Assignments;

public class Assignment12 {

	public static void main(String[] args) {
		//Stock prices in Array
		int[] stockPrice= {7,1,5,3,6,4};
		
		int maxProfit=0;
		
		int sellDay=0;
		int buyDay=0;
		
		// 
		for(int i =0;i<stockPrice.length;i++)
		{
			for(int j=i+1;j<stockPrice.length;j++)
			{
				
				//calculating profit 
				int Profit = stockPrice[j]-stockPrice[i];
				
				if(Profit > maxProfit)
				{
					maxProfit=Profit;
					
					buyDay=i+1;
					sellDay=j+1;
				}
			}
		}
		
		if(maxProfit>0)
		{
			 System.out.println(" maxProfit is " + maxProfit);
	            System.out.println("Buy the share on day " + buyDay);
	            System.out.println("Sell the share on day " + sellDay);
		}
		else {
            // If no profit is possible, warn the user
            System.out.println("You will lose your money, don't buy this share");
        }
	}

}
