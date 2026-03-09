import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ==============================================================
 * INTERFACE - PalindromeStrategy
 * ==============================================================
 * This interface defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Uses LIFO behavior to reverse characters and compare them.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * CLASS - DequeStrategy
 * Uses Deque to compare front and rear elements simultaneously.
 */
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * ==============================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ==============================================================
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String testInput = "madam";
        
        // Inject Strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        
        System.out.println("Using Stack Strategy:");
        System.out.println("Input: " + testInput + " | Result: " + strategy.check(testInput));
        
        // Dynamically switch strategy
        strategy = new DequeStrategy();
        
        System.out.println("\nUsing Deque Strategy (Switched at runtime):");
        System.out.println("Input: " + testInput + " | Result: " + strategy.check(testInput));
    }
}