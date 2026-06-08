package july2025;

public class SecondHighestElementInArray {

	public static void main(String[] args) {
		
		
		int [] a = {25,16,38,10,35,20,50};
		
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
				
				max2=max1;  // assigning old value of max1 to max2 first
				max1=a[i];
			}
			
			else if(a[i]>max2)
			{
				max2=a[i];
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("first maximum value is :"+max1);
		System.out.println("second maximum value is :"+max2);
		
		
		
		
	

	}

}
