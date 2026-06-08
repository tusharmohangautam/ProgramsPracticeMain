package interview2026;

public class Find_SubArray_Check_Target_multiplicationValue {

	public static void main(String[] args) {


		
		
		int[] arr = {2, 3, -2, 4};
        int target = -6; // 3 * -2 = -6

        for (int i = 0; i < arr.length; i++)
        {
            int product = 1;
            for (int j = i; j < arr.length; j++)
            {
                product = product * arr[j];
                if (product == target)
                {
                    System.out.println("Product matched from index " + i + " to " + j);
                    
                    for(int k =i; k<=j; k++)
                    {
                    	System.out.print(arr[k]+" ");
                    }
                    
                }
            }
        }		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
