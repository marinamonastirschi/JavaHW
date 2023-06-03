package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= input.nextInt();
        while(number!=-1){
            System.out.println("Try again");
            number= input.nextInt();
        }
    }
}
