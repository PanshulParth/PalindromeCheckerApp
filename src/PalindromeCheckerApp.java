import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define input string
        String input = "madam";

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base condition: indices crossed or equal
        if (start >= end)
            return true;

        // If mismatch found
        if (s.charAt(start) != s.charAt(end))
            return false;

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}