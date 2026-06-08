package august2025;
import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbersInArray {
    public static void main(String[] args) {
        // Step 1: Define the array
        int[] arr = {1, 3, 4, 5, 3, 6, 3, 7, 8, 3, 9, 5, 6};

        // Step 2: Create a HashMap to store number-frequency pairs
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Step 3: Traverse the array
        for (int num : arr)
        {
        	freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        // Step 4: Print frequencies
        System.out.println("Frequency of each number in the array:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet())
        {
        	if(entry.getValue()>1)
        	{
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        	}
        }
    }
}
