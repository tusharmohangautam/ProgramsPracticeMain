package interview2026;

public class Second_Highest_Value {

	public static void main(String[] args) {
		
		int [] a = {20,19,40,30,22,89,83,36,46,63};
		
		int max1=0;
		int max2=0;
		
		
		if(a[0]>a[1])
		{
			max1=a[0];
			max2=a[1];
			
		}
		else
		{
			max1=a[1];
			max2=a[0];
			
		}
		
		
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
				
			}
			else if(a[i]>max2)
			{
				max2=a[i];
			}
			
		}
		
		
		
		System.out.println("value of max1 is : "+ max1);
		
		System.out.println("value of max2 is : "+ max2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
