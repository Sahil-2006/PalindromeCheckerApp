/**
 * ==============================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==============================================================
 * * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class serves as the entry point, delegating logic to the
 * PalindromeService class.
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "radar";

        // Create an instance of the service class (Encapsulation)
        PalindromeService service = new PalindromeService();

        // Call the service method
        boolean isPalindrome = service.checkPalindrome(input);

        // Display results
        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * Uses the pointer-based approach for optimization.
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Mismatch found
            }
            start++; // Move forward
            end--;   // Move backward
        }

        return true; // No mismatches found
    }
}