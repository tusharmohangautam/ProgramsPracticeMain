package interview2026;
import java.util.LinkedHashMap;
import java.util.Map;

public class Find_Duplicate_Values_ObjectArray {
    public static void main(String[] args) {
        Object[] x = {1, 'a', 2, 'b', 1, 'a', '4', 'c', 2, '$', '$'}; // Added a symbol '$' to show filtering

        Map<Object, Integer> map = new LinkedHashMap<>();

        for (Object y : x) {
            // Check if it's an Integer, OR a Character that represents a digit
            if (y instanceof Integer || (y instanceof Character && Character.isDigit((Character) y))) {
                
                if (map.containsKey(y)) {
                    map.put(y, map.get(y) + 1);
                } else {
                    map.put(y, 1);
                }
                
            } 
            // Else if it's a Character and specifically a letter
            else if (y instanceof Character && Character.isLetter((Character) y)) {
                
                if (map.containsKey(y)) {
                    map.put(y, map.get(y) + 1);
                } else {
                    map.put(y, 1);
                }
                
            }
            // Any special characters (like '$') will be ignored automatically!
        }

        // Print the final repeating elements
        System.out.println("--- Repeating Numbers and Letters ---");
        for (Map.Entry<Object, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element: " + entry.getKey() + " (Repeated " + entry.getValue() + " times)");
            }
        }
        
   /*
else if (y instanceof Character && Character.isLetter((Character) y))
//       |____________________|    |________________________________|
//                 Step 1                               Step 2
//       "Is this box a Character?"       "Great! Unwrap it and check if it's a letter."
   */
        
        
    }
}