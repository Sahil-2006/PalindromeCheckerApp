import java.util.Scanner;

/**
 * ==============================================================
 * MAIN CLASS - UseCase9RecursivePalindrome
 * ==============================================================
 * * Use Case 9: Recursive Palindrome Checker
 * * Description:
 * This class validates a palindrome using recursion.
 * * Characters are compared from the outer positions
 * moving inward using recursive calls.
 * * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 * * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 * * @author Developer
 * @version 9.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Standardize input: remove non-alphanumeric and convert to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = false;
        
        // Handle empty string case or proceed to recursion
        if (cleanInput.isEmpty()) {
            isPalindrome = true;
        } else {
            isPalindrome = check(cleanInput, 0, cleanInput.length() - 1);
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
        
        scanner.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     * Uses the Call Stack to manage subproblems.
     * * @param s      Input string
     * @param start  Starting index
     * @param end    Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition: If indices cross or meet, all characters matched
        if (start >= end) {
            return true;
        }

        // Check if characters at current boundaries match
        if (s.charAt(start) != s.charAt(end)) {
            return false; // Mismatch found, terminates recursion
        }

        // Recursive call: move indices inward
        return check(s, start + 1, end - 1);
    }
}