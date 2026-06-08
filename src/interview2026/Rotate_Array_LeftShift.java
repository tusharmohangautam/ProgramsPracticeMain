package interview2026;

import java.util.Arrays;

public class Rotate_Array_LeftShift {

	public static void main(String[] args) {
		
		
		
	int [] input = {1,2,3,4,5,6,7};	
		
	int k = 3; // Number of rotations
	
	int [] result = new int [input.length];
	
//	for(int i=input.length-1;i>=0;i--)
		for(int i=0;i<input.length;i++)
	{
		
		result[(i-k+ input.length)% input.length]=input[i];
		
	}
		
		for(int num : result)
		{
			System.out.print(num + " ");
			
		}
		
		System.out.println();
		
	System.out.println(Arrays.toString(result));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
