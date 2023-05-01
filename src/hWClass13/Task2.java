package hWClass13;

public class Task2 {
    public static void main(String[] args) {
        String word = "racecar";
        String revWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revWord += word.charAt(i);
        }
        boolean isPalindrome = true;
        if (word.equalsIgnoreCase(revWord)) {
            System.out.println(isPalindrome);
        } else {
            System.out.println(!isPalindrome);
        }
    }
}
