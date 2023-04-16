package groupHW;

public class HW5 {
    public static void main(String[] args) {
        /*5. Write a program to swap 2 numbers without a
        temporary variable?*/

        int num1=15;
        int num2=20;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println(num1);
        System.out.println(num2);

    }
}
