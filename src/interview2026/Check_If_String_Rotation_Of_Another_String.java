package interview2026;

public class Check_If_String_Rotation_Of_Another_String {

	public static void main(String[] args) {
		

		String s1 = "abcd";
		String s2 = "cdab";
		
		if(s1.length()==s2.length() && (s1 + s1).contains(s2))
		{
			System.out.println("Yes, it is a rotation !");
		}
		
	
/*
  If you glue a string to itself (abcdabcd), any valid rotation (like cdab) 
		will naturally appear inside it as a substring.		
		
		
		
That's a very good observation. At first glance, it does look like we're only 
checking whether (s1 + s1) contains s2. However, there's a specific reason why
 this works for rotation checking.

Let's take your example:

s1 = "abcd"
s2 = "cdab"

Concatenate s1 with itself:

s1 + s1 = "abcdabcd"

Now check:

"abcdabcd".contains("cdab")  // true

Why does this indicate a rotation?

All possible rotations of "abcd" appear as contiguous substrings inside "abcdabcd":

Rotation	Present in "abcdabcd"?
abcd	Yes
bcda	Yes
cdab	Yes
dabc	Yes

The logic is based on this property:

If s2 is a rotation of s1, then s2 must be a substring of s1 + s1, provided both strings have the same length.
*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
