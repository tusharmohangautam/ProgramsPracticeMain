package interview2026;

public class Sub_Array_With_Max_Sum {

	public static void main(String[] args) {
	
		
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int maxSum = Integer.MIN_VALUE; // Integer.MIN_VALUE is Java's smallest possible int value
		
		
int startIndex = 0;
int endIndex = 0;


	for(int i=0; i<arr.length; i++)	
	{
		int sum = 0;
		
		for(int j =i; j<arr.length; j++)
		{
			sum = sum + arr[j];
			
			if(sum>maxSum)
			{
				maxSum = sum;
				startIndex = i;
				endIndex = j;
				
			}
			
			
		}
	}
		
	  System.out.println("Maximum Sub-array Sum is: " + maxSum);
	  
	  
	  System.out.println("Printing Sub-Array :");
	  
	  
	  for(int k = startIndex; k<=endIndex; k++)
	  {
		  System.out.print(arr[k]+ " ");
	  }
		
		
		
/*int maxSum = Integer.MIN_VALUE;

does not take the minimum value from the array, and it is not 0.

Integer.MIN_VALUE is Java's smallest possible int value:

-2147483648

We use it so that even if all array elements are negative, 
the program can still find the correct maximum subarray sum.		
		
		
		
*/		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
