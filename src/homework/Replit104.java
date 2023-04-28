package homework;

import java.util.Scanner;

public class Replit104 {
    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);
        String[] names=new String[5];
        for(int i=0;i<5;i++){
            names[i]=inp.next();
            System.out.println(names[i].substring(0,3));
        }
    }
}
