import java.util.*;

public class UseCase13PalindromeCheckerApp {

    static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String rev = "";
        while (!stack.isEmpty()) {
            rev += stack.pop();
        }
        return str.equals(rev);
    }

    static boolean dequeMethod(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    static boolean twoPointerMethod(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean r1 = stackMethod(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean r2 = dequeMethod(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean r3 = twoPointerMethod(input);
        long end3 = System.nanoTime();

        System.out.println("Stack Method: " + r1 + " Time: " + (end1 - start1) + " ns");
        System.out.println("Deque Method: " + r2 + " Time: " + (end2 - start2) + " ns");
        System.out.println("Two Pointer Method: " + r3 + " Time: " + (end3 - start3) + " ns");
    }
}