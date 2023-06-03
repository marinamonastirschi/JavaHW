package class20;

public class Parent {
    void getMarried(){
        System.out.println("marry to the girl of our choice");
    }
}
class Axel extends Parent{
    @Override
    void getMarried() {
        System.out.println("I want to marry Biden");
    }
}
class ParentTester{
    public static void main(String[] args) {
        Axel axel=new Axel();
        axel.getMarried();
    }
}
