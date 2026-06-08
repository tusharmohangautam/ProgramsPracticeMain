 package interview2026;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] inputArray = {10, 20, 10, 30, 40, 20, 50};

        // Step 1: Use LinkedHashSet to maintain order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : inputArray) {
            set.add(num);
        }

        // Step 2: Convert set back to array (optional)
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        // Output
        System.out.println("Original array: " + Arrays.toString(inputArray));
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}
