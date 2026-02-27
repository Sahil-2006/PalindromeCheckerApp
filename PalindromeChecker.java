import java.util.Scanner;
public class PalindromeChecker{
       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            System.out.println("Input text: " + input);
            String reversedInput = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversedInput = reversedInput + input.charAt(i);
            }
            boolean isPalindrome = input.equals(reversedInput);
            System.out.println("Is it a Palindrome? : " + isPalindrome);
       }
}