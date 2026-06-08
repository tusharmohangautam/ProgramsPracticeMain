package interview2026;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class All_Programs_revise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// characters count in a string
		
/*		String s = "automation @*!TEST";
		s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		Set<Character> myset = new LinkedHashSet<Character>();
		
		for(char ch : s.toCharArray())
		{
			myset.add(ch);
		}
		
		
		StringBuffer result = new StringBuffer();
		
		
		for(char ch1 : myset)
		{
			result.append(ch1);
		}
		
		System.out.println("After removing duplicate characters :" + result.toString());
		
		System.out.println("original string : "+s);
	*/
		
		
		
/*	String s = "Java is a programming language and is a popular language";
	
	String [] words = s.split(" ");
	
	Set<String> myset = new LinkedHashSet<String>();
	
	for(String word : words)
	{
		myset.add(word);
	}
		
		
	String result ="";
	StringBuilder result1 = new StringBuilder();
	for(String w: myset)
	{
		result = result+w+" ";
		//result1.append(w1+" ");
	}
		
		
	System.out.println("Final string after removing duplicate words : "+ result1.toString());
	System.out.println("Final string after removing duplicate words : "+ result);
		
	*/
		
		
		// String to integer without using Integer.parseInt(s)
		
	/*	String s = "12345";
		
		int result =0;
		
		for(int i=0;i<s.length();i++)
		{
			int digit = s.charAt(i)-'0';
			
			result=(result*10)+digit;
			
		}
		
		System.out.println("Final integer value is : "+result);
*/
		
	
		// Find vowels and consonants from a string + count of vowels and consonants
		
/*		String s = "auTOMatIOn";
		s=s.toLowerCase();
		
		StringBuilder vowels = new StringBuilder();
		
		StringBuilder consonants = new StringBuilder();
		
		int Vcount=0;
		int Ccount=0;
		
		
		for(char ch : s.toCharArray())
		{
			
			if(Character.isLetter(ch))
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					vowels.append(ch);
					Vcount++;
				}
				
				else
				{
					consonants.append(ch);
					Ccount++;
				}
				
				
				
			}
			
			
		}
		
		
		System.out.println("Vowels are : "+vowels.toString());
		System.out.println("Consonants are : "+consonants.toString());
		
		System.out.println("Count of vowwels is : "+ Vcount);
		System.out.println("Count of consonants is : "+ Ccount);
		
		
*/
		
		// Reverse an integer value without converting it into String
		
/*		int input = 12345;
		
		int result=0;
		
		
		while(input!=0)
		{
			int digit = input%10;
			
			result = (result*10)+digit;
			
			input = input/10;
		}
		
		System.out.println("Reverse int value is : " + result);
			
*/
		
/*		String s = "java is a popular language";
		
		String [] words = s.split(" ");
		
		System.out.println(Arrays.toString(words));
			
		for(String word : words)
		{
			String reverse = "";
			
			for(int i=word.length()-1;i>=0;i--)
			{
				reverse = reverse+word.charAt(i);
			}
			
			System.out.print(reverse +" ");
		}
*/
		
		
		// Rotate right shift an array three times
		
/*		int [] input = {1,2,3,4,5,6};
		
		int k =3;
		int length = input.length;
		
		int [] result = new int [length];
		
		
		for(int i=0;i<input.length;i++)
		{
			result[(i+k)%length] = input[i];
			
		}
		
		System.out.println(Arrays.toString(result));
		
*/
		
		// Find minium and maximum value from an array
		
/*		int []  x = {20,17,45,85,84,20,53,70};
		
		int min1=  x[0];
		int min2=  x[1];
		
		
		
		if(min1<min2)
		{
			min1=x[0];
			min2=x[1];
			
		}
		else
		{
			min2=x[0];
			min1=x[1];
			
		}
		
		for(int i=2;i<x.length;i++)
		{
			if(x[i]<min1)
			{
				min2=min1;
				min1=x[i];
				
			}
			
			else
			{
				min2=x[i];
				
			}
			
			
		}
		
		
	System.out.println("First Minimum value is : " + min1);	
		
	System.out.println("Second Minimum value is : " + min2);	
		
*/
		
/*		int []  x = {1,2,3,4,5,6,7,8};
		
		System.out.println(Arrays.toString(x));
		
		
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		
		for(int k : x)
		{
			System.out.print(k+"\s");
		}
		
		System.out.println();
		
*/

// Print missing number from an array
		
/*		int [] x = {1,2,4,5};
		
		int sum1=0;
		
		for(int i=0;i<x.length;i++)
		{
			sum1=sum1+x[i];
		}
		
		int sum2=0;
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		
		System.out.println("Missing number is : "+ (sum2-sum1));
*/
		
		
		// Find number, find repeat count and find indexing numbers
		
/*		int [] x = {2,8,4,2,6,90,2,67,4,2};		
		
		int count = 0;
		int searchNum =2;
		
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==searchNum)
			{
				count++;
				
				System.out.print(i+" ");
				
			}
			
		}
		
		System.out.println();
		System.out.println("Total count of searched number is : " + count);
		
*/
		
		
		
// convert lowercase to uppercase and uppercase to lowercase
		
/*   String s = "AutOMaTiOnteSTiNg";
   
   String result = "";
   
   for(char ch : s.toCharArray())
   {
	   if(Character.isUpperCase(ch))
	   {
		   result = result+Character.toLowerCase(ch);
	   }
	   else
	   {
		   result = result + Character.toUpperCase(ch);
	   }
	   
	   
   }
		
	System.out.println("Result string is : " + result);	
		
*/
		
		
		// Convert string at odd index to uppercase and even index to lowercase characters
		
		
/*		String s= "automation testing";
		
		char [] ch = s.toCharArray();
		
		//String result = "";
		
		String result = new String(ch);
		
		for(int i=0;i<ch.length;i++)
		{
			
			
			if(i%2==0)
			{
				//result = result + Character.toLowerCase(ch[i]);
				ch[i] = Character.toLowerCase(ch[i]);
			}
			else
			{
				ch[i] = Character.toUpperCase(ch[i]);
			}
			
			
		}
		
		System.out.println(result);
		
*/
		
		
		// Find prime numbers from an array
		
/*		int [] x = {3,7,4,6,8,10,13,14,22,11};		
		
		for(int i=0;i<x.length;i++)
		{
			int primenum = x[i];
			int count =0;
			
			for(int j=1;j<=primenum;j++)
			{
				if(primenum%j==0)
				{
					count++;
					
						
				}
			}
		  if(count==2)
		  {
			  System.out.println("prime number : " + primenum );
		  }
			
		}	
		
		System.out.println();		 
			
			
*/
		
		// Find sum of digits in a string
		
/*		String s = "auto123mat456ion789";
		
		int outputSum = 0;
		
		for(char ch : s.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				outputSum = outputSum + Character.getNumericValue(ch); 
			}
			
		}
		
		
		System.out.println(outputSum);
			
*/
		
		
		
		// Remove duplicate values from a array
		
		
	int [] x = {10,30,20,40,30,60,50,30,70};
	
	int max1=0;
	int max2=0;
	
	if(x[0]>x[1])	
	{
		max1=x[0];
		max2=x[1];
	}
	else
	{
		max2=x[0];
		max1=x[1];
	}
		
		
	for(int i=2;i<x.length;i++)	
	{
		if(x[i]>max1)
		{
			max2=max1;
			max1=x[i];
			
		}
		else
		{
			max2=x[i];
		}
	}
		
		
	System.out.println("First maximum value : "+ max1);	
		
	System.out.println("Second maximum value : "+ max2);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
