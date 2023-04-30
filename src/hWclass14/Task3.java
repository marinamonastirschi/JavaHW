package hWclass14;

public class Task3 {
    //Write a method to return whether given number is prime or not?
    boolean givenNumber(int a) {
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Task3 obj=new Task3();
        boolean b=obj.givenNumber(10);
        System.out.println(b);
    }
}
