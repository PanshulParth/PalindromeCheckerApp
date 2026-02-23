import java.util.Stack;
public class PalindromeCheckerApp {
/**Use Case 5: Stack Based Palindrome Checker*/
public static void main(String[] args) {

    // Declare and initialize input string
    String input = "noon";

    // Create a Stack to store characters
    Stack<Character> stack = new Stack<>();

    // Push each character into the stack
    for (char c : input.toCharArray()) {
        stack.push(c);
    }

    // Assume palindrome initially
    boolean isPalindrome = true;

    // Compare original string with stack pop (reverse order)
    for (char c : input.toCharArray()) {

        if (c != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }

    // Output format (from screenshot)
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}
}

