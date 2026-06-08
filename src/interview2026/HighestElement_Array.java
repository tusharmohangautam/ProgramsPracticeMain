package interview2026;

public class HighestElement_Array {

	public static void main(String[] args) {
		
		
		
		
		int [] a = {10,30,20,40,50,90,70};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		
		System.out.println("Largest element in array is :" + max);
		
		
	}

}
