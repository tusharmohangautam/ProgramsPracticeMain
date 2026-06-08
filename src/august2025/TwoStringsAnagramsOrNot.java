package august2025;

import java.util.Arrays;

public class TwoStringsAnagramsOrNot {

	public static void main(String[] args) {
		
		String a="listen";
		
		String b="silent";
		
		
		System.out.println(a.length());
		System.out.println(b.length());
		
		if(a.length()==b.length())
		{
			System.out.println("Strings are Anagrams....");
		}
		else
		{
			System.out.println("Strings are not Anagrams...");
		}
		
		
		char [] c=a.toCharArray();
		char [] d=b.toCharArray();
		
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		if(Arrays.equals(c, d))
		{
			System.out.println("Strings are Anagrams....");
		}
		
		else
		{
			System.out.println("Strings are not Anagrams...");
		}
		
		
		

	}

}
