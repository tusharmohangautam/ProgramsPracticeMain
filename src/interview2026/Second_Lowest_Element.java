package interview2026;

public class Second_Lowest_Element {

	public static void main(String[] args) {
		
		
		
		int [] a = {2,65,92,01,33,31,45,67,10};
		
		int min1=0;
		int min2=0;
		
		
		if(a[0]<a[1])
		{
			min1=a[0];
			min2=a[1];
		}
		else
		{
			min1=a[1];
			min2=a[0];
		}
		
		
		for(int i=2;i<a.length;i++)
		{
			
			if(a[i]<min1)
			{
				
				min2=min1;
				min1=a[i];
			}
			
			else if(a[i]<min2)
			{
				min2=a[i];
				
			}
			
		}
		
		System.out.println("First minimum value is : "+min1);
		
		System.out.println("Second minimum value is : "+min2);
		
		

	}

}
