package Revision_July_2026;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Revising_String_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String s = "javalanguage";
		 * 
		 * Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		 * 
		 * char [] ch = s.toCharArray();
		 * 
		 * for(char ch1 : ch) { if(map.containsKey(ch1)) { map.put(ch1, map.get(ch1)+1);
		 * }
		 * 
		 * 
		 * else { map.put(ch1, 1); }
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		 * if(entry.getValue()>1) { System.out.println(entry.getKey() + " " +
		 * entry.getValue()); }
		 * 
		 * }
		 * 
		 * 
		 */

		/*
		 * String s = "java is a popular language and is very commonly used";
		 * 
		 * Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		 * 
		 * String [] arr = s.split(" ");
		 * 
		 * System.out.println(arr.length);
		 * 
		 * for(String S : arr) {
		 * 
		 * if(map.containsKey(S)) { map.put(S, map.get(S)+1);
		 * 
		 * }
		 * 
		 * else { map.put(S, 1); }
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * for(Map.Entry<String, Integer> entry : map.entrySet()) {
		 * if(entry.getValue()>1) { System.out.println(entry.getKey() +" " +
		 * entry.getValue()); } }
		 * 
		 * 
		 */

		/*
		 * String s = "abc&def%ghi^jklm:";
		 * 
		 * s = s.replaceAll("[^a-zA-Z0-9]", "");
		 * 
		 * System.out.println(s);
		 */

		/*
		 * String s = "siyana";
		 * 
		 * StringBuilder s1 = new StringBuilder(s);
		 * 
		 * System.out.println(s1.reverse());
		 */

		/*
		 * String s = "siyana";
		 * 
		 * StringBuffer S = new StringBuffer(s);
		 * 
		 * System.out.println(S.reverse());
		 */

		/*
		 * String s = "siyana";
		 * 
		 * String finalStr = "";
		 * 
		 * for(int i=s.length()-1;i>=0;i--) { finalStr = finalStr + s.charAt(i); }
		 * 
		 * System.out.println("Output reverse string is : " + finalStr);
		 */

		/*
		 * String s = "siyana";
		 * 
		 * char[] ch = s.toCharArray();
		 * 
		 * String finalStr = "";
		 * 
		 * for (int i = ch.length - 1; i >= 0; i--) { finalStr = finalStr + ch[i]; }
		 * 
		 * System.out.println(finalStr);
		 * 
		 */

		/*
		 * int x = 13;
		 * 
		 * int count = 0;
		 * 
		 * 
		 * for(int i=1;i<=x;i++) { if(x%i==0) { count++;
		 * 
		 * } }
		 * 
		 * 
		 * if(count ==2 ) { System.out.println("x is a prime number...."); }
		 * 
		 * else { System.out.println("X is not a prime number...."); }
		 * 
		 */

		/*
		 * int [] x = {20,13,17,80,4,33,7,73};
		 * 
		 * for(int i =0; i<x.length;i++) { int checkPrimeNum = x[i];
		 * 
		 * int count = 0;
		 * 
		 * for(int j = 1;j<=checkPrimeNum ; j++) { if(checkPrimeNum%j==0) { count++; } }
		 * 
		 * if(count == 2) { System.out.print(checkPrimeNum + " "); }
		 * 
		 * 
		 * 
		 * }
		 * 
		 * System.out.println();
		 */

		// Remove duplicate values from a string

		/*
		 * String s = "language";
		 * 
		 * Set<Character> set = new HashSet<Character>();
		 * 
		 * char a [] = s.toCharArray();
		 * 
		 * 
		 * for(char ch1 : a) { set.add(ch1);
		 * 
		 * }
		 * 
		 * char [] b = new char [set.size()]; int count = 0;
		 * 
		 * 
		 * for(char ch : set) { b[count]=ch; count++; }
		 * 
		 * System.out.println(Arrays.toString(b));
		 * 
		 * System.out.println(b.length);
		 */

		/*
		 * String s = "language";
		 * 
		 * Set<Character> set = new HashSet<Character>();
		 * 
		 * char a [] = s.toCharArray();
		 * 
		 * 
		 * for(char ch1 : a) { set.add(ch1);
		 * 
		 * }
		 * 
		 * 
		 * StringBuilder uniqueStr = new StringBuilder(); for(char ch : set) {
		 * uniqueStr.append(ch); }
		 * 
		 * System.out.println(uniqueStr.toString());
		 * 
		 */

		/*
		 * String s = "java is a java language and is otpion of knowring is";
		 * 
		 * Set<String> set = new HashSet<String>();
		 * 
		 * String [] arr = s.split(" ");
		 * 
		 * 
		 * for(String a : arr) { set.add(a); }
		 * 
		 * 
		 * 
		 * String [] arr1 = new String[set.size()]; int count = 0;
		 * 
		 * for(String a1 : set) { arr1[count] = a1; count++;
		 * 
		 * }
		 * 
		 * StringBuilder uniqueStr = new StringBuilder();
		 * 
		 * for(String a1 : set) { uniqueStr.append(a1).append(" ");
		 * 
		 * }
		 * 
		 * 
		 * 
		 * System.out.println(uniqueStr.toString());
		 * 
		 * 
		 */
		
		
		
	int [] a = {10,30,21,10,40,67,50,40,98};
	
	Set<Integer> set = new LinkedHashSet<Integer>();
	
	for(int x : a)
	{
		set.add(x);
	}
	 
		
		
		
	int [] b = new int [set.size()];
	
	int count = 0;
	
	for(int x : set)
	{
		b[count] = x;
		count++;
	}
		
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}