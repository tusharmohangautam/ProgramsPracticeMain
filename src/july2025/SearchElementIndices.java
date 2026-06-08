package july2025;
import java.util.Scanner;

public class SearchElementIndices {
	
    public static void main(String[] args) {
    	
    	
        int[] arr = {1, 3, 4, 5, 3, 6, 3, 7, 8, 3, 9};
        
        int searchElement = 3;
        
      int count =0;
        boolean found = false;
        
        System.out.print("Element found at indices: ");

        for (int i = 0; i < arr.length; i++) {
            if (searchElement ==arr[i]) {
            	
                System.out.print(i + " ");
                found = true;
                count++;
                
            }
        }

        System.out.println();
        System.out.println("Total repeation == " +count);
        
        if (found==true) {
            System.out.println("Element  found....");
        }
        else
        {
        	System.out.println("Element Not Found....");
        }
        
    }
}
