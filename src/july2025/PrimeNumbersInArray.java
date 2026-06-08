package july2025;
public class PrimeNumbersInArray {
	 // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) 
        	return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    
    
    public static void main(String[] args) {
        int[] numbers = {10, 3, 5, 6, 17, 22, 29, 33};

        System.out.print("Prime numbers in the array: ");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            
        }
        System.out.println();
    }

   
}
