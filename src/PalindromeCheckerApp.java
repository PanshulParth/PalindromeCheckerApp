public class PalindromeCheckerApp {
/**Use Case 4: Character Array Based Validation*/
public static void main(String[] args) {

    // Declare and initialize input string
    String input = "radar";

    // Convert string into character array
    char[] chars = input.toCharArray();

    // Initialize pointers
    int start = 0;
    int end = chars.length - 1;

    // Assume palindrome initially
    boolean isPalindrome = true;

    // Compare characters until pointers cross
    while (start < end) {

        if (chars[start] != chars[end]) {
            isPalindrome = false;
            break;
        }

        start++;
        end--;
    }

    // Output (format from screenshot)
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}
}

