package interview2026;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class June24_2026_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//String s = "automation*@test%ing";
//
//s=s.replaceAll("[^a-zA-Z0-9]", "");
//
//System.out.println(s);
//
//// fetching count of each character
//
//Map<Character,Integer> map = new HashMap<Character,Integer>();
//
//for(char ch : s.toCharArray()) {
//	
//	if(map.containsKey(ch))
//	{
//		map.put(ch, map.get(ch)+1);
//	}
//	
//	else
//	{
//		map.put(ch, 1);
//	}
//}
//
//
//	for(Map.Entry<Character, Integer> entry : map.entrySet())	
//	{
//		// if want character repeating more than once
//		if(entry.getValue()>1)
//			
//		System.out.println(entry.getKey() +" "+entry.getValue());
//	}
//		
//		
		
		
		/*
		 * String s = "automa%&tion*ntes#ti@ng";
		 * 
		 * s = s.replaceAll("[^a-zA-Z0-9]", "");
		 * 
		 * System.out.println(s);
		 * 
		 * 
		 * Set<Character> set = new LinkedHashSet<Character>();
		 * 
		 * 
		 * for(char ch : s.toCharArray()) { set.add(ch); }
		 * 
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * for(char ch1 : set) { sb.append(ch1); }
		 * 
		 * System.out.println(sb.toString());
		 */


		/*
		 * String s = "java is a popular language and java is liked by many people";
		 * 
		 * System.out.println(s.length()); // Length of String
		 * System.out.println(s.replace("java", "python")); // Replacing java with
		 * python
		 * 
		 * String [] s1 = s.split(" ");
		 * 
		 * System.out.println(s1.length); // total number of string in array
		 * 
		 * 
		 * Map<String,Integer> map = new HashMap<String,Integer>();
		 * 
		 * for(String a1 : s1) { if(map.containsKey(a1)) { map.put(a1 , map.get(a1)+1);
		 * } else { map.put(a1, 1); } }
		 * 
		 * for(Map.Entry<String, Integer> entry : map.entrySet()) {
		 * if(entry.getValue()>1) { System.out.println(entry.getKey() + " " +
		 * entry.getValue()); }
		 * 
		 * 
		 * }
		 */
		
		
		/*
		 * String s = "java is a popular language and java is liked by many people";
		 * 
		 * String [] s1 = s.split(" ");
		 * 
		 * Set<String> set = new LinkedHashSet<String>();
		 * 
		 * for(String z : s1) { set.add(z); }
		 * 
		 * 
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * for(String z1 : set) { sb.append(z1).append(" "); }
		 * 
		 * System.out.println(sb.toString());
		 */
		
		
		
		/*
		 * String s = "12345"; // check whether string contains only digits or not
		 * 
		 * boolean isOnlyDigits = true;
		 * 
		 * 
		 * for(char ch : s.toCharArray()) { if(!Character.isDigit(ch)) { isOnlyDigits =
		 * false; break; }
		 * 
		 * }
		 * 
		 * 
		 * if(isOnlyDigits==true) {
		 * System.out.println("String only contains digits....."); }
		 * 
		 * else { System.out.println("String contains both digits and characters....");
		 * }
		 */		
		
		
		/*
		 * int [] x = {10,30,20,50,20,60,80,40,90,50};
		 * 
		 * System.out.println(x.length); // Find length of array
		 * 
		 * System.out.println(Arrays.toString(x)); // Printing Array values
		 * 
		 * // Find count of each element in array
		 * 
		 * Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		 * 
		 * for(int s : x) { if(map.containsKey(s)) { map.put(s, map.get(s)+1); } else {
		 * map.put(s, 1); } }
		 * 
		 * System.out.println("Printing count of each element in array ....");
		 * for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
		 * if(entry.getValue()>1) System.out.println(entry.getKey()
		 * +" "+entry.getValue());
		 * 
		 * 
		 * }
		 */
		
		
		
		
		
		/*
		 * // Removing duplicate elements from an array
		 * 
		 * int [] x = {10,30,20,50,20,60,80,40,90,50};
		 * 
		 * 
		 * Set<Integer> set = new LinkedHashSet<Integer>();
		 * 
		 * for(int y : x) { set.add(y); // Stored unique values in Set collection }
		 * 
		 * 
		 * int [] z = new int [set.size()];
		 * 
		 * int count = 0;
		 * 
		 * 
		 * for(int y1 : set) { z[count++]=y1;
		 * 
		 * }
		 * 
		 * System.out.println(Arrays.toString(z));
		 */		
		
		
		/*
		 * // Find first and second highest element from an array int [] x =
		 * {10,30,20,50,20,60,80,40,90,50};
		 * 
		 * int max1=0; int max2=0;
		 * 
		 * if(x[0]>x[1]) { max1=x[0]; max2=x[1]; } else { max1=x[1]; max2=x[0]; }
		 * 
		 * for(int i=2;i<x.length;i++) { if(x[i]>max1) { max2=max1; max1=x[i]; } else
		 * if(x[i]>max2) { max2=x[i]; } }
		 * 
		 * System.out.println("First highest element from array is : " + max1);
		 * 
		 * System.out.println("Second highest element from array is : " + max2);
		 */		
		
		
		
// Find first and second lowest element from an array
//		int [] x = {10,30,20,50,20,60,80,40,90,50};
//		
//		int min1 = 0;
//		int min2 = 0;
//		
//		if(x[0]<x[1])
//		{
//			min1=x[0];
//			min2=x[1];
//		}
//		else
//		{
//			min1=x[1];
//			min2=x[0];
//		}
//		
//		
//		for(int i=2;i<x.length;i++)
//		{
//			if(x[i]<x[0])
//			{	min2=min1;
//			    min1=x[i];
//			}   
//			    else if(x[i]<min2)
//			    {
//			    min2=x[i];	
//			    }	
//			
//			
//		}
//		
//	System.out.println("First lowest number in array is : "+min1);	
//		
//	System.out.println("Second lowest number in array is : "+min2);	
		
		
		
		
// Reverse sort elements of an array
		
		int [] x = {10,30,20,50,20,60,80,40,90,50};
		
	for(int i=0;i<x.length;i++)	
	
{
		for(int j=i+1;j<x.length;j++)
		{		
	     
	
	      if(x[i]<x[j])
	      {
		   int temp = x[i];
		   x[i] = x[j];
		   x[j] = temp;
		     
	      }
	   }
	
}
		
System.out.println(Arrays.toString(x));		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
