package class6;

import java.util.Scanner;

public class Repl32 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        System.out.println("Please enter your age");
        String gender= scanner.next();
        int age= scanner.nextInt();
        if(age>25&&gender.equals("F")){
            System.out.println("Woman");
        } else if(age>25&&gender.equals("M")) {
            System.out.println("Man");
        } else {
    }if(age<25&&gender.equals("F")) {
        System.out.println("Girl");
    } else if(age<25&&gender.equals("M")){
        System.out.println("Boy");


    }



}
    }
