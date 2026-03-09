
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
import java.util.LinkedList;
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";
        LinkedList<Character> list = new LinkedList<>();
        for(char c: input.toCharArray()){
            list.add(c);
        }
        boolean isPalindrome = true;
        while(list.size()>1){
            if(list.removeFirst() != list.removeLast()){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : "+input);
        System.out.println("Is Palindrome? : "+isPalindrome);

    }
}