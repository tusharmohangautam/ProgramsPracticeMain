package interview2026;

public class MaxLength_SubString_Without_Duplicate_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "tushaar";
        String maxSubstring = ""; // This will hold our winning longest substring

        // 1. Same nested loops you just learned to get every substring
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                
                String sub = str.substring(i, j);

                // 2. Secret Check: If front search and back search find the SAME 'a'
                // (This means 'a' appears only 1 time or 0 times)
                if (sub.indexOf('a') == sub.lastIndexOf('a')) {
                    
                    // 3. If this safe substring is LONGER than our previous winner, update it!
                    if (sub.length() > maxSubstring.length()) {
                        maxSubstring = sub;
                    }
                }
            }
        }

        // Print the winner!
        System.out.println("Longest valid substring: " + maxSubstring);
        System.out.println("Maximum Length: " + maxSubstring.length());		
		
		
/*
 1. The Fixed Address Map
Before anyone starts looking, Java labels every character with a permanent index number starting from 0 from the left:

Plaintext
 Letters:  |  t  |  u  |  s  |  h  |  a  |
           |     |     |     |     |     |
 Indices:  |  0  |  1  |  2  |  3  |  4  |
 
2. How indexOf('a') Looks
This driver enters the street from the Left side (Index 0).

He drives forward: checking house 0 (t), house 1 (u), house 2 (s), house 3 (h)...

He stops at house 4 because he finds 'a'.

Result returned: 4

3. How lastIndexOf('a') Looks
This driver enters the street from the Right side (the very end, Index 4).

He starts looking immediately at house 4.

Guess what? House 4 has the letter 'a'! He doesn't even need to drive backward down the street; he finds it on his very first step.

Result returned: 4

4. Why 4 == 4 Means "No Duplicates"
Because indexOf returned 4 and lastIndexOf returned 4, the computer realizes: "Wow, the driver from the left and the driver from the right both stopped at the exact same house number." If both drivers stop at the same house, it proves there is only one single house with the letter 'a' on		
 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
