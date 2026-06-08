package july2025;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
	
		int [] a= {10,20,30,40,50,60};
		
		System.out.println(a);
		System.out.println(a[2]);
		System.out.println(a[1]+" "+a[3]);
		
		System.out.println("size of array is:"+a.length);
		
		
		//check lowest element in array
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println("minimum value is:"+min);
		
		
		//check highest number in array 
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum values is:"+max);
		
		
		
		//read all values from array
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		
		// read all values using enhanced for loop
		
		for(int aa:a)
		{
			System.out.print(aa+" ");
		}
		System.out.println();
		System.out.println("all values are retrieved from array a[]");
		
		System.out.println("all values of array a[] are: "+Arrays.toString(a));
		
		Arrays.sort(a);
		
		
	//	System.out.println("after sorting values of array a[] are:"+Arrays.toString(a));
		
		
		int [] b= {1,3,4,2,7,9,5,11,17};
		
		System.out.println(Arrays.toString(a));
		
		for(int b1:b)
		{
			System.out.print(b1+" ");
		}
		System.out.println();
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(b.length);
		
		
		int add=0;
		
		for(int i=0;i<b.length;i++)
		{
			add=add+b[i];
		}
		System.out.println(add);
		
		
		// print even values from array
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				System.out.print(b[i]+" ");
			}
		}
		System.out.println();
		
		
		// printodd values from array
				for(int i=0;i<b.length;i++)
				{
					if(b[i]%2!=0)
					{
						System.out.print(b[i]+" ");
					}
				}
				System.out.println();
		
		int search=11;
		boolean bb=false;
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==search)
			{
				bb=true;
				break;
			}
		}
		if(bb==true)
		{
			System.out.println("Search element is present in array....");
		}
		System.out.println();
		
		
		int [] c= {2,3,4,5,7};
		
		int sum1=0;
		for(int i=0;i<c.length;i++)
		{
			sum1=sum1+c[i];
			
		}
		System.out.println(sum1);
		
		
		int sum2=0;
		for(int i=2;i<=7;i++)
		{
			sum2=sum2+i;
			
		}
		System.out.println(sum2);
		
		System.out.println("missing number is:"+(sum2-sum1));
		
		
		int counteven=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]%2==0)
			{
				counteven++;
			}
			
		}
		
		System.out.println("count of even numbers is:"+counteven);
		
		
		
		int countodd=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]%2!=0)
			{
				countodd++;
			}
			
		}
		
		System.out.println("count of odd numbers is:"+countodd);
		
		
		
		String [] s= {"A","C","E","D","B"};
		
		System.out.println(Arrays.toString(s));
		System.out.println(s.length);
		
		System.out.println(s[1].length());
		
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		
		
		
		
		
		
		
		
		

	}

}
