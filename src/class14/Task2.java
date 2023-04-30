package class14;

public class Task2 {
    void printLargest(int a,int b){
       if(a>b){
           System.out.println(a+" is the largest number");
       }else{
           System.out.println(b+" is the largest number");
       }
    }

    public static void main(String[] args) {
        Task2 obj=new Task2();
        obj.printLargest(5,8);
    }
}
