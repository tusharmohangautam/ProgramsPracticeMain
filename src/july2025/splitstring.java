package july2025;

import java.util.Arrays;

public class splitstring {

	public static void main(String[] args) {
		
		
/*		String s="abc@xyz";
		
		String [] s1=s.split("@");

System.out.println(Arrays.toString(s1));
		
System.out.println(s1[1]);		
		
	*/	
		
		
		
/*		String s="abc 123 xyz 456 mno";	
		
		String [] s1=s.split(" ");
		
		
		System.out.println(Arrays.toString(s1));
		
		System.out.println(s1[3]);
		
*/		
		
/*		String s="abc,123@xyz";
		
		String [] s1=s.split(",");
		
		System.out.println(Arrays.toString(s1));
		
		String [] s2=s1[1].split("@");
		
		System.out.println(Arrays.toString(s2));
		
	*/
		
		
		
		
	/*	String s="$15,20,25";
		
		System.out.println(s.replace("$","").replace(",",""));
		
	*/
		
		String s="welcome";
		
		
		String rev="";
		
		
		for(int i=6;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		
		
		// converting to char array
		
		char [] ch=s.toCharArray();
		String rev1="";
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev1=rev1+ch[i];
		}
		System.out.println(rev1);
		
		
		
		// using StringBuffer
		
		StringBuffer s1=new StringBuffer("welcome");
		System.out.println(s1.reverse());
		
		
		
		// using stringBuilder class
		
		StringBuilder s2=new StringBuilder("hellotushar");
		
		System.out.println(s2.reverse());
		
		
	String s3=	new StringBuilder(s).reverse().toString();
		
		
	System.out.println("reverse string is:"+ s3);	
		
		
		System.out.println(s.concat(" home guddu"));
		
		s.concat(" home guddu");
		System.out.println(s);
		
		
		s2.append(" java-maths");
		
		System.out.println(s2);

	}

}
