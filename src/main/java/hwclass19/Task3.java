package hwclass19;

import static hwclass19.Task3.a;

public class Task3 {
    static void a(int a,int b){
        System.out.println(a*b);
    }
    static void a(double a, int b){
        System.out.println(a*b);
    }
    static void a(int a, double b){
        System.out.println(a*b);
    }
}
class Task3Tester{
    public static void main(String[] args) {
        a(3,8);
        a(4.5,10);
        a(8,6.2);
    }
}
