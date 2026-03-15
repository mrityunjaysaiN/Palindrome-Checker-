import java.util.*;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        boolean palindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }

        sc.close();
    }
}