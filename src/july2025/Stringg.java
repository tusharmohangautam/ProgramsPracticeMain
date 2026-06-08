package july2025;

public class Stringg {

	public static void main(String[] args) {
		
		
String s="welcome";

String s1="Welcome";

String s2=new String("WELCOME");





System.out.println(s==s1.toLowerCase());
System.out.println(s2.toLowerCase());
System.out.println(s.toUpperCase());
System.out.println(s.substring(3,7));
System.out.println(s.contains("lco"));
System.out.println(s.length());

System.out.println(s.charAt(5));		
		
System.out.println(s1+s2);		
System.out.println(s1.concat(s2));		
System.out.println("welcome".concat(s2));		
		
System.out.println("welcome".concat("Welcome").concat("WELCOME"));		
		
		
		
String s3="  welcomehome  ";	
System.out.println(s3);
		System.out.println(s3.length());

		
		
	String s4=s3.trim();	
	System.out.println(s4.length());	
		
		
	System.out.println(s1.equals(s2.toLowerCase()));	
		
	System.out.println(s1.toUpperCase());	
		
	System.out.println(s4.toUpperCase());	
		
		
		System.out.println(s.replace('w','G'));
	
		System.out.println(s4.replace("come","some"));
		
		
		
		System.out.println(s.substring(2,4));
		
		
		

	}

}
