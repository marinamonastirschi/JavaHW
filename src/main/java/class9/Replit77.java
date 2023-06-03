package class9;

import java.util.Scanner;

public class Replit77 {
    public static void main(String[] args){
        int[] num=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println();

        for(int i=num.length-1;i>=0;i--){
            num[i]=scanner.nextInt();
            System.out.println(num[i]);
        }

    }
}
