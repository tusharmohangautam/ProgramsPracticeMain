package mayRevision;

public class reverseWords {

	
	public static String reverseWordsInPlace(String str) {
		
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            // Reverse each word and append to result
            reversed.append(new StringBuilder(word).reverse()).append(" ");
        }

        return reversed.toString().trim(); // Remove trailing space
    }
	
    public static void main(String[] args) {
        String input = "Hello World Java";
        String result = reverseWordsInPlace(input);
        System.out.println("Reversed Words: " + result);
    }

    
}
