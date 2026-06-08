package mayRevision;

import java.util.Arrays;

public class ArrayPrograms {

	public static void main(String[] args) {

        // find largest number in an array
		
/*		int [] a= {10,20,30,40,50,60};
		
		int search_num=a[0];
		
		for(int i=1;i<=5;i++)
		{
		if(a[i]>search_num)
		{
			search_num=a[i];
			
		}
		
		}
		System.out.println(search_num); */
		

		// find lowest number in an array
		
   /*  int [] a= {10,20,30,40,50,60};
		
		int min=a[0];
		
		for(int i=1;i<=5;i++)
		{
		if(a[i]<min)
		{
			min=a[i];
			
		}
		
		}
		System.out.println(min);  */
		
		
		// find missing number in an array
		
		
 /*       int [] a= {1,2,3,5};
		
		int sum1=0;
		
		for(int i=0;i<=3;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
		
		
int sum2=0;
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		
		
	System.out.println("missing number is:"+(sum2-sum1));	 */
		
		
		
/*		int [] a= {1,2,3,5};
		System.out.println(a.length);
	System.out.println(a[2]);
	System.out.println(Arrays.toString(a));
	
	for(int i=0;i<=3;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
	
	for(int a1:a)
	{
		System.out.print(a1+" ");
	}
	System.out.println();   */
	
	
	
	int [] [] b= {{10,20},{30,40}};
	
	System.out.println(b.length);
	System.out.println(b[0].length);
	
	System.out.println(b[0][1]);
	System.out.println(b[1][1]);
	
	
	for(int r=0;r<b.length;r++)
	{
		for(int c=0;c<=1;c++)
		{
			System.out.print(b[r][c]+" ");
		}
System.out.println();
	}
	System.out.println();
	
	
	
	for(int [] b1:b)
	{
		for(int x:b1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	
	
	
	
/*	int [] a= {1,2,3,4,5};
	int sum=0;
	
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];	
	}
	
	System.out.println("sum of numbers is:"+ sum);
	
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	System.out.println();
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.print(a[i]+" ");
		}
	}
	System.out.println();
	
	
	for(int a1:a)
	{
		if(a1%2==0)
		{
			System.out.print(a1+" ");
		}
		
	}
	System.out.println();
	
	
	for(int a1:a)
	{
		if(a1%2!=0)
		{
			System.out.print(a1+" ");
		}
		
	}
	System.out.println();  */
	
	
	// searching an element in an array
	
/*	int [] a= {1,2,3,3,4,3,5};
	
	int even=0;
	int odd=0;
	
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			even++;
			
		}
		
		
	}
	System.out.println(even);
	
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			odd++;
			
		}
		
		
	}
	System.out.println(odd);   */
	
	
	int [] a= {1,3,2,4,5};
	
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	
	
	String [] q= {"a","c","e","b","d"};
	System.out.println(Arrays.toString(q));
	Arrays.sort(q);
	System.out.println(Arrays.toString(q));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
