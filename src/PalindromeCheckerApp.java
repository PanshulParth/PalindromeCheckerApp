import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
/**Use Case 6: Queue + Stack Fairness Check*/
public static void main(String[] args) {

    // Define the input string
    String input = "civic";

    // Create Queue (FIFO)
    Queue<Character> queue = new LinkedList<>();

    // Create Stack (LIFO)
    Stack<Character> stack = new Stack<>();

    // Insert characters into both structures
    for (char c : input.toCharArray()) {
        queue.add(c);   // enqueue
        stack.push(c);  // push
    }

    // Flag to track palindrome status
    boolean isPalindrome = true;

    // Compare until queue is empty
    while (!queue.isEmpty()) {

        char fromQueue = queue.remove();  // FIFO
        char fromStack = stack.pop();     // LIFO

        if (fromQueue != fromStack) {
            isPalindrome = false;
            break;
        }
    }

    // Output format (as shown)
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}
}

