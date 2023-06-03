package hwclass19;

public class Task4 {
    private void x(int a, int b){
        System.out.println(a*b);
    }
    private void x(int a, double b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Task4 obj=new Task4();
        obj.x(1,5);
        obj.x(5,8.6);
    }
}
class Task4Tester{
    public static void main(String[] args) {
        Task4 obj=new Task4();
        // obj.x can't access private method
    }
}
