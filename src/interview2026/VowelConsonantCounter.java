package interview2026;

public class VowelConsonantCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
String s = "Automation Testing";
        
        int vCount = 0;
        int cCount = 0;
        
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        // Convert to lowercase to simplify the check
        String str = s.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if it is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vCount++;
                    vowels.append(ch).append(" ");
                } 
                // If it's a letter but not a vowel, it's a consonant
                else {
                    cCount++;
                    consonants.append(ch).append(" ");
                }
            }
        }

        System.out.println("Original String: " + s);
        System.out.println("---------------------------");
        System.out.println("Vowels Count: " + vCount);
        System.out.println("Vowels: " + vowels.toString());
        System.out.println("---------------------------");
        System.out.println("Consonants Count: " + cCount);
        System.out.println("Consonants: " + consonants.toString());
		
		
		
		
		
		
		
		
		
	}

}
