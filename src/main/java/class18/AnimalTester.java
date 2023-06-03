package class18;

public class AnimalTester {
    /*create 5 classes of different animals like cat dog zebra camel horse, in each class create 5 fields and
    3 methods.
     */
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.eat();
        horse.color="Black";
        Cat cat=new Cat();
        cat.name="Mano";
        cat.sleep();
        cat.isPurring();
    }

}
