package groupProject;

public class Task1 {
    /* Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".

     */

    public static void main(String[] args) {
        String a="Hello";
        String revStr="";
        for (int i = a.length()-1; i >= 0; i--) {
            revStr+=a.charAt(i);
        }
        System.out.println(revStr);
    }
}
