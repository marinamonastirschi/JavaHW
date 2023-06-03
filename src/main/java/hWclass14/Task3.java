package hWclass14;

public class Task3 {
    //Write a method to return whether given number is prime or not?
   boolean isPrime(int a){
       int count=0;
       boolean prime=false;
       for (int i = 1; i < a; i++) {
           if(a%i==0);
           count++;

       }
       if(count==2){
           prime=true;
       }
       return prime;
   }

    public static void main(String[] args) {
        Task3 obj=new Task3();
        int b=3;
        boolean result=obj.isPrime(b);
        System.out.println(result);
    }

    }
