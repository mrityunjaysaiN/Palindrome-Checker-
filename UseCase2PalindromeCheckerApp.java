public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("Palindrome Checker App");
            System.out.println("UC2: Print a Hardcoded Palindrome Result");
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}