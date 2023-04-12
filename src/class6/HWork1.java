package class6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HWork1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the day in numbers");
        int day= input.nextInt();
        if(day>=1&&day<=5){
            System.out.println("It's a weekday");
        }else if(day==7&&day==6){
            System.out.println("It's weekend");
        }else{
            System.out.println("Wrong input");
        }

    }
}
