/**
 * ==============================================================
 * MAIN CLASS - UseCase9RecursivePalindrome
 * ==============================================================
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Step 1: Define and Normalize the input string
        // (Recursive checks are usually done on pre-processed strings)
        String original = "A man a plan a canal Panama";
        String normalized = original.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        // Step 2: Call the recursive method
        boolean isPalindrome = isPalindromeRecursive(normalized);

        // Step 3: Output the results
        System.out.println("Input String  : " + original);
        System.out.println("Normalized    : " + normalized);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }

    /**
     * Recursive helper method to validate palindrome logic.
     */
    public static boolean isPalindromeRecursive(String str) {
        // Base Case 1: If string length is 0 or 1, it is a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Base Case 2: If first and last characters don't match, it's NOT a palindrome
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recursive Step: Call the method again with the inner substring
        // substring(1, str.length() - 1) removes the first and last characters
        return isPalindromeRecursive(str.substring(1, str.length() - 1));
    }
}