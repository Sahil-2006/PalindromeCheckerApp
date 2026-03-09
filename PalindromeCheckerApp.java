import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string
        String input = "refer";
        
        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove from both ends
            char first = deque.removeFirst();
            char last = deque.removeLast();

            // Compare front and rear elements
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}