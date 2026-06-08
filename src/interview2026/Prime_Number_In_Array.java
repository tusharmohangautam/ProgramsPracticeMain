package interview2026;

public class Prime_Number_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] input = {1,4,2,8,11,17,19};
	
		
		
		System.out.println("Prime numbers in Array : ");
		
		
		// Step 1: Go through each number in the array
		for(int i=0;i<input.length;i++)
		{
			int num = input[i];
			int count = 0;
			
			// Step 2: Try dividing 'num' by every number from 1 up to 'num'
			for(int j=1;j<=num;j++)
		 {
			if(num%j==0)
			{
				count++;
				
			}
		 }	
			
			if(count==2)
			{
				System.out.println(num + " ");
			}
		   // inner for loop closed
			
		} // outer for loop closed
		
		System.out.println();
		

		
		
	}

}
