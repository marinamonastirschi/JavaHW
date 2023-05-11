package class20;

public class Animals {
    String name;
    String color;
    int age;

    Animals(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
    void isEating(){
        System.out.println(name+" "+" is eating...");
    }
    void isDrinking(){
        System.out.println(name+" is drinking");
    }

}
class Dog extends Animals{

    Dog(String name, String color, int age) {
        super(name, color, age);
    }
}
class Cat extends Animals {
    Cat(String name, String color, int age) {
        super(name, color, age);
    }
}
class Horse extends Animals{

    Horse(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void isDrinking(){
        System.out.println("Horse likes to drink a lot of water");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Eva","Black",2);
        dog.printInfo();
        dog.isDrinking();

        Cat cat=new Cat("Biba","Black",1);
        cat.isEating();
        cat.isDrinking();

        Horse horse=new Horse("Boy","Brown",4);
        horse.isDrinking();
        horse.printInfo();

    }
}

