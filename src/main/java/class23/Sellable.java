package class23;

public interface Sellable {

    // private int PRICE=12000; private access modifier not allowed
    // protected in PRICE=12000; protected access modifier not allowed
    int PRICE=12000;

    // final abstract void sell(); final not allowed as methods are abstract by default
    // static void(); not allowed as static methods can't be overriden
    // private void sell(); not allowed as not one will be able to provide implementations
    // protected void sell(); not allowed
    static void sell(){
        System.out.println("Allowed");
    }
}
class Tester1{
    public static void main(String[] args) {
        Sellable.sell();
    }
}
