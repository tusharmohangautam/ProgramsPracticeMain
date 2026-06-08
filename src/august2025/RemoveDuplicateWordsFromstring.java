package august2025;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsFromstring {

	public static void main(String[] args) {
		
		String a= "Java is a programing language Java is very popular programing language";
		
		String [] b=a.split(" ");
		
		Set<String> myset=new LinkedHashSet<String>();
		
		for(String s:b)
		{
			myset.add(s);
		}
		
		
		StringBuilder result=new StringBuilder();
		
		for(String s:myset)
		{
			result.append(s);
		}
		
		System.out.println("original string--->"+a);
		
		System.out.println("After removing duplicate words--->"+result.toString()+" ");
		

	}

}
