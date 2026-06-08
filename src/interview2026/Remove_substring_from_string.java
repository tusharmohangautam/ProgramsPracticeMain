package interview2026;

public class Remove_substring_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String s = "CoreJavaProgramingJava";
	
	String target = "Java";
	
	// This removes the first occurrence of the target string by replacing it with nothing
	//s = s.replaceFirst(target, "");
	
	
	// This removes EVERY occurrence of "Java"
	s= s.replace(target, "");
	
	
	System.out.println("After removing targeted substring : "+ s);	
		
		
		
		
		
		
		

	}

}
