package stringHomework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is mom's first name?");
        String momName= scanner.next();
        System.out.println("What is dad's first name?");
        String dadName= scanner.next();
        System.out.println("Expecting boy or girl?");
        String gender= scanner.next();

        String suggestedBabyName=null;
        if(gender.equalsIgnoreCase("boy")){
            suggestedBabyName=dadName.substring(0,2)+momName.substring(momName.length()-2);
        }else if(gender.equalsIgnoreCase("girl")){
            suggestedBabyName=momName.substring(0,2)+dadName.substring(dadName.length()-3);
        }
        System.out.println("Suggested name is "+suggestedBabyName);
    }
}
