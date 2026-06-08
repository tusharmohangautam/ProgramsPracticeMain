package mayRevision;

import java.util.Arrays;

public class StringQuestions {

	public static void main(String[] args) {

String s1="welcome";
String s2=" velocity ";
String s3="WELCOME";
String s4="I am going to delhi. I am a tester";


System.out.println(s1.equals(s3.toLowerCase()));
System.out.println(s1.substring(3,5));
System.out.println(s1);
System.out.println(s1.charAt(3));
System.out.println(s1.length());		
System.out.println(s1.concat(s3));		
System.out.println(s1+"@"+s2.toLowerCase());		
System.out.println("welcome"+s2);		
		
System.out.println(s2.length());
String s=s2.trim();
System.out.println(s.length());
		
System.out.println(s4.replace("am","was"));		
		
System.out.println(s4.replace('e','o'));		
		
		
		
	// reversing a string by using for loop	
		
		String s11="";
		
	/*	for(int i=s1.length()-1;i>=0;i--)
		{
			s11=s11+s1.charAt(i);
			
		}  */
		 
	//	System.out.println("reverse string is....."+s11);
		
		
		
		// reversing a string by converting to char array
		
		 char [] ch=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		System.out.println(ch.length);
		
		for(int i=ch.length-1;i>=0;i--)
		{
			s11=s11+ch[i];
		}
		System.out.println("reverse string is....."+s11);
		
		
		
		// reversing a string using stringBuffer and stringBuilder class
		
		
		StringBuffer ss=new StringBuffer("tusharmohangautam");
		
		System.out.println(ss.reverse());
		
		ss.append("@hello");
		
		System.out.println(ss.reverse());
		
		
		
		String a1="velocity";
		String a2=new String("velocity");
		String a3="velocity";
		System.out.println(a1==a3);
		
		System.out.println(a1.equals(a2));
		
		System.out.println(a1.toUpperCase());
		
		
		String z1="abc@xyz";
		
		String [] z2=z1.split("@");
		
		System.out.println(z2.length);
		System.out.println(Arrays.toString(z2));
		System.out.println(z2[1]);
		
		
		
		String x1="abc,xyz@qwe";
		 String x2 [] =x1.split(",");
		 System.out.println(Arrays.toString(x2));
		System.out.println(x2[1]);
		
		String x3 [] =x2[1].split("@");
		
		System.out.println(Arrays.toString(x3));
		
		String x4="abc xyz cvb";
		
		String [] x5=x4.split(" ");
		
		System.out.println(Arrays.toString(x5));
	
		
		
		String x6 = "$15,20,25";
		
		System.out.println(x6.replace("$", "").replace(",", ""));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
