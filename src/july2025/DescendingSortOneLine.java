package july2025;
import java.util.Arrays;

import java.util.Collections;

public class DescendingSortOneLine {
    public static void main(String[] args) {
        Integer[] arr = {30, 10, 50, 20, 40};

        
        
        
        // Sort in descending order using Collections.reverseOrder()
        Arrays.sort(arr, Collections.reverseOrder());

        
        
        System.out.println("Array in Descending Order: " + Arrays.toString(arr));
    }
}
