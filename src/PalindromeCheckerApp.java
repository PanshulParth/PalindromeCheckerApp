import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
/**Use Case 7: Deque Based Optimized Palindrome Checker*/
public static void main(String[] args) {

    // Define the input string
    String input = "refer";

    // Create a Deque to store characters
    Deque<Character> deque = new ArrayDeque<>();

    // Add each character to the deque
    for (char c : input.toCharArray()) {
        deque.add(c);
    }

    // Flag to track palindrome result
    boolean isPalindrome = true;

    // Compare front & rear until one or no elements remain
    while (deque.size() > 1) {

        char first = deque.removeFirst();
        char last = deque.removeLast();

        if (first != last) {
            isPalindrome = false;
            break;
        }
    }

    // Output format (as shown)
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}
}

