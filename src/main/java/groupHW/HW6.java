package groupHW;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        /*6. Write a java program to check whether a given
        number is prime or not?*/

        int num=10;
        boolean isPrime=true;
        for (int i = 2; i <num ; i++) {
            if(num%i==0) {
                isPrime=false;
                break;
            }

        }
        if(isPrime) {
            System.out.println("number "+num+" is prime");
        }else {
            System.out.println("number "+num+" is not prime");
        }

    }
}
