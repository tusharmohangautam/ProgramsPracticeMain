package july2025;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {

 int [] x= {10,30,50,20,40,40};
 
 System.out.println(x);
System.out.println(x.length);		
System.out.println(x[2]);		
System.out.println(x[1]+"..."+x[4]);		
		
		
	for(int i=0;i<x.length;i++)	
	{
		System.out.print(x[i]+" ");
		
	}
		System.out.println();
		
		
		
		for(int y:x)
		{
			System.out.print(y+" ");
			
		}
			System.out.println();
		
		
	System.out.println(Arrays.toString(x));	
		
	Arrays.sort(x);	
	
	System.out.println("After sorting.."+Arrays.toString(x));	
	
		
		
		//searching lowest element in array
	int max=x[0];
	
	for(int i=1;i<x.length;i++)
	{
		if(x[i]>max)
		{
			max=x[i];
		}
	}
		System.out.println("value of max is:"+max);
		
		
	// searching lowest element n an array
		
		int min=x[0];
		
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<min)
			{
				min=x[i];
			}
		}
			System.out.println("value of min is:"+min);
		
		
		// searching an element in an array
			
			int search=30;
			boolean b =false;
			
			for(int i=0;i<x.length;i++)
			{
				if(x[i]==search)
				{
					System.out.print("search element is present:");
					b=true;
					break;
				}
				
			}
		System.out.println();
		
		if(b==false)
		{
			System.out.println("Element is not present...");
		}
		
		
		// finding sum of all elements
		
		int sum=0;
		
	/*	for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println("total sum =:"+sum);
	*/	
		
		for(int y1:x)
		{
			sum=sum+y1;
		}
		System.out.println("total elements sum  =:"+sum);
		
		
		
		int even=0;
		int odd=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				System.out.print(x[i]+" ");
				even++;
			}
			
		}	
		System.out.println();
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2!=0)
			{
				System.out.print(x[i]+" ");
				odd++;
			}
			
		}	
		System.out.println();
		
		
		
		
		// count repeatation of a number in an array
		
		int search1=40;
		int countt=0;
		
		for(int y:x)
		{
			if(y==search1)
			{
				countt++;
			}
			
			
			
		}
		
		System.out.println(countt);
		
		// Find missing number in array
		int y []= {1,2,4,5,6};
		
		int sum1=0;
		
		for(int i=0;i<y.length;i++)
		{
			sum1=sum1+y[i];
		}
		
		System.out.println(sum1);
		
int sum2=0;
		
		for(int i=1;i<=6;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		
		
		System.out.println("Missing number is:"+(sum2-sum1));
		
		
		
		
		
	}

}
