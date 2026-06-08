package interview2026;

import java.util.Arrays;

public class ReverseSort_Array {

	public static void main(String[] args) {
		
		
		int[] arr = {10, 5, 8, 2, 1};

        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]<arr[j])
        		{
        			int temp = arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        			
        		}
        		
        	}
        	
        }
                
        System.out.println("Reverse Array is : " + Arrays.toString(arr));
        
        
        
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			int temp = arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        			
        		}
        		
        	}
        	
        }
        
        
        
        System.out.println("Reverse sorted Array is : " + Arrays.toString(arr));  
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
