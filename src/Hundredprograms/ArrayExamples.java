package Hundredprograms;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {

int [] a= {1,2,3,4,5};
int even=0;
int odd=0;
int count=0;
for(int i=0;i<a.length;i++)
{
	//int count=0;
	count=count+a[i];
	
}
System.out.println(count);	
		
		
	for(int i=0;i<a.length;i++)	
	{
		if(a[i]%2==0)
		{
			System.out.print(a[i]+" ");
			even++;
		}
	}
	System.out.println();
	for(int i=0;i<a.length;i++)	
	{
		if(a[i]%2!=0)
		{
			System.out.print(a[i]+" ");
			odd++;
		}
	}
	System.out.println();
		
	System.out.println(even);	
		System.out.println(odd);
		
	//searching an element in an array
	
	int[] b= {10,20,30,40,50};
	int search_num=30;
	boolean status=false;
	
	for(int i=0;i<b.length;i++)
	{
		if(search_num==b[i])
		{
			System.out.println("element found..");
			status=true;
			break;
		}
		
		
	}
	
	if(status==false)
	{
		System.out.println("element not found...");
	}
	
	
	int[] c= {10,20,30,40,30,50,20,70,20,80,20};
	
	int num=20;
	int tcount=0;
	
	for(int a1:c)
	{
		if(num==a1)
		{
			tcount++;
		}
		
	}
	System.out.println(tcount);	
		
		
	//sorting elements in an array
	
	int [] d= {100,300,200,500,400,700,600};
	
	System.out.println("before sorting:"+Arrays.toString(d));
	
	Arrays.sort(d);
	
	System.out.println("after sorting:"+Arrays.toString(d));
	
	
	String [] e= {"a","d","e","c","b"};
	System.out.println("before sorting:"+Arrays.toString(e));
	Arrays.sort(e);
	System.out.println("after sorting:"+Arrays.toString(e));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
