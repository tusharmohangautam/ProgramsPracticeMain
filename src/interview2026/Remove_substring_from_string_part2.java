package interview2026;

public class Remove_substring_from_string_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String s = "CoreJavaProgramingJava";
	
	String target = "Java";
	
	
	int index = s.indexOf(target);
	
	// Change 'if' to 'while' to repeat the process
	
	while(index!=-1)
	{
		s = s.substring(0, index) + s.substring(index + target.length());
		index = s.indexOf(target);  // Look for the next occurrence
		
	}
		
		
	System.out.println(s); // Output: CoreProgramming	
		
		
		

	}

}
