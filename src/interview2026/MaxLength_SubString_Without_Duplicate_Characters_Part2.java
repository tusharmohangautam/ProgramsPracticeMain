package interview2026;

public class MaxLength_SubString_Without_Duplicate_Characters_Part2 {

    public static void main(String[] args) {
        
        String str = "tushaar";
        String maxStr = ""; // Will hold our longest unique substring

        // 1. Nested loops to get every possible substring
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i + 1; j <= str.length(); j++)
            {
                
                String sub = str.substring(i, j);
                
                // 2. Secret Check: See if 'sub' contains ANY duplicate characters
                boolean hasDuplicate = false;
                String seenCharacters = ""; 
                
                for (int k = 0; k < sub.length(); k++) {
                    String currentLetter = String.valueOf(sub.charAt(k));
                    
                    // If we've seen this letter before in this substring, it's a duplicate!
                    if (seenCharacters.contains(currentLetter))
                    {
                        hasDuplicate = true;
                        break; // Stop checking this substring immediately
                    }
                    seenCharacters += currentLetter; // Remember this letter
                }

                // 3. If it's completely unique and LONGER than our last winner, update it!
                if (!hasDuplicate && sub.length() > maxStr.length()) {
                    maxStr = sub;
                }
            }
        }

        System.out.println("Longest Unique Substring: " + maxStr);
        System.out.println("Maximum Length: " + maxStr.length());
    }
}