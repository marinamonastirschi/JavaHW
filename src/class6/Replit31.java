package class6;

import java.util.Scanner;

public class Replit31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean isSunny = scanner.nextBoolean();
        System.out.println("What is the temperature outside?");
        if (isSunny) {
            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
            int temperature = scanner.nextInt();
            if (temperature > 85) {
                System.out.println("I am going to the beach");
            } else {
                System.out.println("I am going to the park");
            }

        } else {
            System.out.println("I stay home and practice Java");
        }

    }
}
