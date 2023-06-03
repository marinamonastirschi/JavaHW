package class7;

import java.util.Scanner;

public class E16WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number greater than 1");
        int number = scanner.nextInt();
        int counter = 1;
        while (counter <= number) {
            System.out.print(counter);
            counter++;
        }
    }
}
