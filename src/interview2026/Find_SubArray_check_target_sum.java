package interview2026;

public class Find_SubArray_check_target_sum {

	public static void main(String[] args) {
	
		
		int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33; // 20 + 3 + 10 = 33
        
        for(int i=0; i<arr.length; i++)
        {
        	int sum = 0;
        	
        	for(int j=i; j<arr.length; j++)
        	{
        		sum = sum + arr[j];
        		
        		if(sum == target)
        		{
        			System.out.println("Found between indices " + i + " and " + j);
        			
        			for(int k =i; k<=j;k++)
        			{
        				System.out.print(arr[k] + " ");
        			}
                    return;
        		}
        	}
        	
        }
		
		
		
		
		
		
/*
  break and return behave differently here.

break exits only the inner loop (for (int j = i; ...)).
return exits the entire method (main) immediately.
 
  		
If you use:

if (sum == target) {
    System.out.println("Found between indices " + i + " and " + j);
    break;
}

the outer loop (i) will continue running, and the program will 
keep checking other subarrays.

The author used return because as soon as the target sum is found,
 there is no need to continue searching, so the whole program stops immediately.  		
  		
 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
