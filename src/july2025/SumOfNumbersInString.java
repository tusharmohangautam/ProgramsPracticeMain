package july2025;
public class SumOfNumbersInString {
    public static void main(String[] args) {
        String input = "abc12def34ghi5";  // Example string with numbers
        int sum = 0;
        String number = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                number += ch; // build the number
            } else {
                if (!number.isEmpty()) {
                    sum += Integer.parseInt(number); // convert and add
                    number = ""; // reset
                }
            }
        }

        // If string ends with a number, add the last one
        if (!number.isEmpty()) {
            sum += Integer.parseInt(number);
        }

        System.out.println("Sum of numbers in the string: " + sum);
    }
}
