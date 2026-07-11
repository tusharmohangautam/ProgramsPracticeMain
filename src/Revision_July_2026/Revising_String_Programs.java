package Revision_July_2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Revising_String_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String s = "abc@def";
		 * 
		 * String [] s1=s.split("@");
		 * 
		 * System.out.println(s1.length); System.out.println(s1[1]);
		 * System.out.println(s.replace('@', '#'));
		 * System.out.println(s.concat("Java")); System.out.println(s.substring(0,4));
		 */

		/*
		 * String s = "AutomationTesting";
		 * 
		 * s=s.toLowerCase();
		 * 
		 * System.out.println(s.length());
		 * 
		 * 
		 * Set<Character> set = new LinkedHashSet<Character>();
		 * 
		 * for(char ch : s.toCharArray()) { set.add(ch);
		 * 
		 * }
		 * 
		 * 
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * for(char ch1 : set) { sb.append(ch1); }
		 * 
		 * 
		 * System.out.println(sb.toString());
		 */

		/*
		 * int [] x = {10,30,40,20,10,70,20,90,30,80,};
		 * 
		 * System.out.println(x.length);
		 * 
		 * System.out.println(x[4]);
		 * 
		 * System.out.println(Arrays.toString(x));
		 * 
		 * 
		 * // Remove duplicates
		 * 
		 * Set<Integer> set = new HashSet<Integer>();
		 * 
		 * for(int y :x ) { set.add(y); }
		 * 
		 * int [] y = new int[set.size()] ;
		 * 
		 * int count = 0;
		 * 
		 * for(int z : set) { y[count++] = z; }
		 * 
		 * System.out.println(Arrays.toString(y));
		 */

		/*
		 * int [] x = {10,30,50,70,20,80,60};
		 * 
		 * int min1 = 0; int min2 =0;
		 * 
		 * 
		 * if(x[0]<x[1]) { min1 = x[0]; min2 = x[1];
		 * 
		 * }
		 * 
		 * else { min1 = x[1]; min2 = x[0]; }
		 * 
		 * 
		 * 
		 * for(int i=2; i<x.length;i++) { if(x[i]<min1) { min2 = min1; min1 = x[i]; }
		 * 
		 * else if(x[i]<min2) { min2 = x[i]; }
		 * 
		 * }
		 * 
		 * 
		 * System.out.println("First minimum value : " + min1);
		 * 
		 * System.out.println("Second minimum value : " + min2);
		 * 
		 */

// check whether string contains 

		/*
		 * String s = "12235";
		 * 
		 * 
		 * boolean isDigit = true;
		 * 
		 * 
		 * for(int i=0;i<s.length();i++) { char ch = s.charAt(i);
		 * 
		 * if(!Character.isDigit(ch)) { isDigit = false; break; }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * if(isDigit==false) {
		 * System.out.println("String contains characters and digits ...."); }
		 * 
		 * else { System.out.println("String contains only digits...."); }
		 */

		/*
		 * // check a number is prime or not
		 * 
		 * int x = 13;
		 * 
		 * boolean numberIsPrime = false;
		 * 
		 * int count = 0;
		 * 
		 * for(int i=1;i<=x;i++) { if(x%i==0) { count++;
		 * 
		 * }
		 * 
		 * if(count==2) { numberIsPrime = true; }
		 * 
		 * 
		 * }
		 * 
		 * if(numberIsPrime) { System.out.println("x is a prime number...."); } else {
		 * System.out.println("x is not a prime number...."); }
		 */

		/*
		 *  Find prime numbers in an array
		 * 
		 * int [] x = {10,31,47,90,55,67,97,23,46,20,50,80};
		 * 
		 * 
		 * ->iterate through all array elemnts through a loop to check all values ->
		 * Then will use a for loop which will start from 1 and iterate till x[i] ->will
		 * take a variable count => and if count is 2 then array element is Prime Number
		 * 
		 * System.out.println("Prime numbers in Array are ::: ");
		 * 
		 * for(int i=0;i<x.length;i++) { int y = x[i]; int count = 0;
		 * 
		 * for(int j =1; j<=y;j++) { if(y%j==0) { count++; } }
		 * 
		 * if(count == 2) { System.out.print(y+" "); }
		 * 
		 * }
		 * 
		 */

	
	
		/*
		 * String s = "AutoMationTestIng";
		 * 
		 * // Convert lower to upper & upper to lower
		 * 
		 * char ch [] = s.toCharArray();
		 * 
		 * String newStr = "";
		 * 
		 * for(char ch1 : ch) { if(Character.isLowerCase(ch1)) { newStr = newStr +
		 * Character.toUpperCase(ch1); }
		 * 
		 * else { newStr = newStr + Character.toLowerCase(ch1); }
		 * 
		 * }
		 * 
		 * System.out.println("Final string is : " + newStr);
		 */	
		
		
	
		/*
		 * String s = "AutoMationTestIng";
		 * 
		 * String newString = "";
		 * 
		 * for(int i=0;i<s.length();i++) { char ch = s.charAt(i);
		 * 
		 * if(Character.isUpperCase(ch)) { newString = newString +
		 * Character.toLowerCase(ch); } else { newString = newString +
		 * Character.toUpperCase(ch); }
		 * 
		 * 
		 * }
		 * 
		 * System.out.println("Final string is : " + newString);
		 * 
		 * 
		 */	
		
		
		/*
		 * String s = "AutoMationTestIng";
		 * 
		 * char ch [] = s.toCharArray();
		 * 
		 * 
		 * for(int i=0;i<ch.length;i++) { if(Character.isLowerCase(ch[i])) { ch[i] =
		 * Character.toUpperCase(ch[i]); }
		 * 
		 * else { ch[i] = Character.toLowerCase(ch[i]); } }
		 * 
		 * 
		 * String result = new String(ch);
		 * 
		 * System.out.println(result);
		 * 
		 */
	
	
		/*
		 * String s = "AutoMationTestIng";
		 * 
		 * StringBuilder result = new StringBuilder();
		 * 
		 * for(char ch : s.toCharArray()) { if(Character.isLowerCase(ch)) {
		 * result.append(Character.toUpperCase(ch)); } else {
		 * result.append(Character.toLowerCase(ch)); } }
		 * 
		 * System.out.println(result.toString());
		 * 
		 */	
	
	
// Find sum of digits in a string
		
		String s = "aut1234mat567ion";
		
		int sum = 0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				sum = sum+Character.getNumericValue(ch);
			}
			
			
			
		}
		
	System.out.println("Sum of digits in a string is : " + sum);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	}
}
