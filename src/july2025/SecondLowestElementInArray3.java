package july2025;

public class SecondLowestElementInArray3 {

	public static void main(String[] args) {
		
		
		int [] a = {25,16,38,10,35,38,20,50};
		
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
			
				min2=min1;   // assigning old value of max1 to max2 first
				min1=a[i];
			}
			
			else if(a[i]<min2)
			{
				min2=a[i];
			}
			
			
		}
		
		
		
		System.out.println("first minimum value is :"+min1);
		System.out.println("second minimum value is :"+min2);
		
		
		
		
	

	}

	}

