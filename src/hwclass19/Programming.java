package hwclass19;

public class Programming {
    void display(String x){
        System.out.println("I love "+x);
    }
    void display(){
        System.out.println("I love programming languages");
    }
}
class ProgrammingTester {
    public static void main(String[] args) {

        Programming obj = new Programming();
        obj.display();
        obj.display("Java");
    }
}
