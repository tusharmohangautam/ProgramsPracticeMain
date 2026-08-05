package Revision_July_2026;

import java.util.LinkedHashMap;
import java.util.Map;

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
		
		
		
		
int [] x = {20,13,17,80,4,33,7,73};	
		
	for(int i =0; i<x.length;i++)	
	{
		int checkPrimeNum = x[i];
		
		int count = 0;
		
		for(int j = 1;j<=checkPrimeNum ; j++)
		{
		if(checkPrimeNum%j==0)
		{
			count++;
		}
		} 
		
		if(count == 2)
		{
			System.out.print(checkPrimeNum + " ");
		}
		
		
		
	}
		
	System.out.println();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}