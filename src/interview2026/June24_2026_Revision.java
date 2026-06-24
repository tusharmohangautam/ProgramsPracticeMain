package interview2026;

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
		
		
		
String s = "12345A"; // check whether string contains only digits or not

boolean isOnlyDigits = true;


for(char ch : s.toCharArray())
{
	if(!Character.isDigit(ch))
	{
		isOnlyDigits = false;
		break;
	}
	
}
		
		
if(isOnlyDigits==true)		
{
	System.out.println("String only contains digits.....");
}
		
else
{
	System.out.println("String contains both digits and characters....");
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
