package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("is it time for break true/false");
        boolean isBreak= scanner.nextBoolean();
        if(isBreak){
            System.out.println("Let's have a break");
        }else{
            System.out.println("Let's continue the class");
        }
    }
}
