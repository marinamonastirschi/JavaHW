package stringHomework;

public class Task2 {
    public static void main(String[] args) {
        //Create a String and print it in reverse order (Sunday → yadnuS).

        String month="April";
        for (int i = month.length()-1; i >=0 ; i--) {
            System.out.print(month.charAt(i));

        }
    }
}
