package groupProject;

public class Task2 {
    /* Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
     */
    public static void main(String[] args) {
        String a = "race";
        String revStr = "";
        for (int i = a.length()-1; i >= 0; i--) {
            revStr+=a.charAt(i);
        }
        if(a.equals(revStr)){
            System.out.println("true");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
