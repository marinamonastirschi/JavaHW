package class21;

public class Grandpa {
    double money=150;

}
class Father extends Grandpa{
    double money=100;

}
class Child extends Father{
    void printMoney(){
        System.out.println(money);

    }
}
class Tester{
    public static void main(String[] args) {
        Child ch=new Child();
        ch.printMoney();
    }
}
