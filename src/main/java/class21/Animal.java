package class21;

import class20.Animals;

public class Animal {
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void speak() {
        System.out.println("Animals speak");
    }

    void sleep() {
        System.out.println("Animals sleep");
    }

    void eat() {
        System.out.println("Animals eat");
    }


    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }
}

class Cat extends Animal {

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Meow meow.....");
    }

    @Override
    void eat() {
        System.out.println("Cats like to eat fish");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep 20h per day");
    }
}

class Dog extends Animal {


    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("woof woof...");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to chew on bones");
    }

    @Override
    void sleep() {
        System.out.println("Dogs like to sleep 5h per day");
    }

    void run() {
        System.out.println("Dog can run fast");
    }
}

class Horse extends Animal {

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Neigh neigh....");
    }

    @Override
    void eat() {
        System.out.println("Horses like to eat Carrots+ Grass");
    }

    @Override
    void sleep() {
        System.out.println("Horses like to sleep 2h per day");
    }
}

class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("shaggy", "black", "German");
        dog.printInfo();

        // Parent class variables can store the objects of the child classes
        Animal dog1 = new Dog("shaggy", "black", "german");
        dog1.printInfo();

        Animal[] animals = {new Dog("shaggy", "black", "german"), new Cat("Tom", "Blue", "persian")};
        for (Animal animal : animals) {
            animal.printInfo();
        }
        //type casting(widening)
        double d=10;
        Animal dog2=new Dog("shaggy", "black", "german");

        //type casting(narrowing)
        int g=(int)10.5;
        // Dog dog3=(Dog)new Animal("shaggy", "black", "german"); not allowed
    }
}

