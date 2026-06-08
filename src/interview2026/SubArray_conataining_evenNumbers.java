package interview2026;

import java.util.Arrays;

public class SubArray_conataining_evenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   int[] arr = {3, 2, 4, 6, 7, 8};

	        int[] evenArr = new int[arr.length];
	        int count = 0;
	        
	        
for(int i=0; i<arr.length; i++)	        
{
	if(arr[i]%2==0)
	{
		evenArr[count] = arr[i];
		count++;
	}
	
}
	        
	


System.out.println("print sub array with even numbers....");


//System.out.println(Arrays.toString(evenArr));
		
for (int i = 0; i < count; i++)
{
    System.out.print(evenArr[i] + " ");
}



		
	}

}
