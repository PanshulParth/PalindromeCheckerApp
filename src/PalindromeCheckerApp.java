public class PalindromeCheckerApp {
/**Use Case 3 :Reverse String Based Palindrome Check*/
public static void main(String[] args) {

    // Hardcoded string
    String input = "madam";

    // Variable to store reversed string
    String reversed = "";

    // Iterate from last character to first
    for (int i = input.length() - 1; i >= 0; i--) {
        reversed = reversed + input.charAt(i);
    }

    // Compare original and reversed string
    boolean isPalindrome = input.equals(reversed);

    // Output
    System.out.println("Original String : " + input);
    System.out.println("Reversed String : " + reversed);
    System.out.println("Is Palindrome? : " + isPalindrome);
}
}

