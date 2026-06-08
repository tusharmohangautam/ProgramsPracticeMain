package interview2026;
import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatationCount_Char_Num {
    public static void main(String[] args) {
        // Object array containing both Integers and Characters
        Object[] x = {1, 'a', 2, 'b', 1, 'a', 4, 'c', 2, 6, 'b'};

        // Using LinkedHashMap to safely handle mixed types (Integer and Character)
        Map<Object, Integer> map = new LinkedHashMap<>();

        // 1. Your exact logic to populate the map
        for (Object y : x) {
            if (map.containsKey(y)) {
                map.put(y, map.get(y) + 1);
            } else {
                map.put(y, 1);
            }
        }

        // 2. Your exact logic to print duplicates (updated to entry.getKey())
        for (Map.Entry<Object, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate value from Array : " + entry.getKey());
            }
        }
    }
}