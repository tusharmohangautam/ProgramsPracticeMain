package august2025;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
		
		
		String a = "Automation Testing";
		
		a=a.replaceAll("\\s+","").toLowerCase();
		
		Set<Character> ms=new HashSet<Character>();
		
		for(char ch:a.toCharArray())
		{
			ms.add(ch);
		}
		
		StringBuilder result = new StringBuilder();
		
		for(char ch:ms)
		{
			result.append(ch);
		}
		
		System.out.println("original string-->"+ a);
		
		System.out.println("after removing duplicates character--->"+ result.toString());
	}

}
