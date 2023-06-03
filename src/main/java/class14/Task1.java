package class14;

public class Task1 {
    boolean isEven(int a){
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        boolean flag=obj.isEven(5);
        System.out.println(flag);
    }
}
