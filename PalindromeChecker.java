import java.util.Scanner;
public class PalindromeChecker{
       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            System.out.println("Input text: " + input);
            boolean isPalindrome = true;
           for(int i=0,j=input.length()-1;i<input.length()/2;i++,j--){
                if(input.charAt(i)!=input.charAt(j)){
                    isPalindrome = false;
                    break; 
                }
           }
           System.out.println("Is it a Palindrome? : " + isPalindrome);
       }
}