package hwClass17;

public class Task2 {
    String name;
    int age;
    double weight;
    private Task2(String name){
        this.name=name;
        System.out.println(name);
    }
    public Task2(int age){
        this.age=age;
        System.out.println(age);
    }
    Task2(double weight){
        this.weight=weight;
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Task2 obj1=new Task2("John");
        Task2 obj2=new Task2(45);
        Task2 obj3=new Task2(65.2);

    }
}
