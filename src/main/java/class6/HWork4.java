package class6;

import java.util.Scanner;

public class HWork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = input.next();
        if (month.equals("March") || month.equals("April") || month.equals("May")) {
            System.out.println("You were born in season Spring");
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            System.out.println("You were born in season Summer");
        } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            System.out.println("You were born in season Fall");
        } else if (month.equals("December") || month.equals("January") || month.equals("February")) {
            System.out.println("You were born in season Winter");
        } else {
            System.out.println("Invalid input");
        }

    }
}
