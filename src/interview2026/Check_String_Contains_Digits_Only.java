package interview2026;

public class Check_String_Contains_Digits_Only {

	public static void main(String[] args) {
		
		String input = "123456";
		
		boolean isOnlyDigits = true;
		
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			
			if(!Character.isDigit(ch))
			{
				isOnlyDigits = false;
				break;
			}
		}	
			
	
		if(isOnlyDigits==true)
		{
			System.out.println("String only contains digits..");
		}
		else
			System.out.println("String contains character and digits ...");
		
		
		
		
		
		// Approach 2
		
    String input1 = "123456";
        
        // matches() returns true if the entire string follows the pattern
        if (input1.matches("[0-9]+")) {
            System.out.println("Only digits!");
        } else {
            System.out.println("Not only digits!");
        }

        
        
     // Approach 3
		
        String input2 = "123456";
            
        boolean isOnlyDigits1 = input2.matches("\\d+");
            
            if (isOnlyDigits1)
            {
                System.out.println("Only digits!");
            } 
            else {
                System.out.println("Not only digits!");
        
            }
            
            
            
 /* In Java, \\d+ is a Regex (Regular Expression) shorthand for matching digits. It is a more professional and concise way of writing [0-9]+.

Here is the breakdown of that specific line:

The Breakdown of \\d+

\\d: This is a predefined character class that matches any single digit from 0 to 9.

Note: In Java, we use a double backslash (\\) because a single backslash is an escape character in Strings.

+: This is a quantifier that means "one or more times." It ensures the string isn't empty and that every character follows the pattern.

.matches(): This method returns true only if the entire string matches the pattern from start to finish.
        
        
 How to explain this in an Interview
If the interviewer asks why you used \\d+ instead of a loop, you can provide this one-liner:

"The \\d+ expression is a Regex meta-character sequence where \\d represents any digit and the
 + quantifier ensures the string contains one or more digits. Using .matches() with this 
 pattern allows for a highly readable and memory-efficient validation of the entire string 
 in a single line of code."       
        
        
        
        
        
*/



             
	}

}
