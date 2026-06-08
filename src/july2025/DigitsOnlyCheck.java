package july2025;
public class DigitsOnlyCheck {
    public static void main(String[] args) {
        String input = "123456"; // Try changing to "123abc" or "abc123" to test

        boolean isOnlyDigits = true;

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isOnlyDigits = false;
                break;
            }
        }

        if (isOnlyDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains alphabets or other characters.");
        }
    }
}
