package Hundredprograms;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {

String s="welcome";
System.out.println(s.contains("wel"));
System.out.println(s.replace('e', 't'));		
		
String z="welcome java selenium python java";
System.out.println(z.replace("java","english"));
System.out.println(z.substring(2));		
System.out.println(z.substring(2, 3));		
		
		
	String x="abc@gmail";
	String [] x1=x.split("@");
	System.out.println(x1[1]);
		
		
	String a="$15,20,25";
	System.out.println(a.length());
	System.out.println(a.replace("$","").replace(",","r"));
	System.out.println(a.length());
	
	
	
	StringBuilder  b=new StringBuilder("welcome");
	b.append("to jungle");
	System.out.println(b);
	
	
	
	
	
	
	
	
	

	}

}
