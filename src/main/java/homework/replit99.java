package homework;

import java.util.Scanner;

public class replit99 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below
        String reverse = "";
        givenString.equalsIgnoreCase(givenString);
        givenString.equalsIgnoreCase(" ");
        int length = givenString.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + givenString.charAt(i);
            if (givenString.equals(reverse)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }
    }
