package interview2026;

public class Longest_Palindromic_SubString {

	public static void main(String[] args) {
		
		
		
String s = "abcba";

String longestSub = "";

for(int i=0;i<s.length();i++)
{
	for(int j=i+1;j<=s.length();j++)
	{
		String subStr = s.substring(i,j);
		
		if(subStr.equals(new StringBuilder(subStr).reverse().toString()))
		{
			if(subStr.length()>longestSub.length())
			{
				longestSub = subStr;
			}
		}
		
		
		
	}
}
		
		
	System.out.println("Longest palindromic string : " + longestSub);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
