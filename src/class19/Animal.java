package class19;

public class Animal {
    private String breed;
    private String name;
    private String color;
    private int age;
    private double weight;

    Animal(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println(name + " " + breed + " " + color + " " + age + " " + weight);
    }

}

class Dog extends Animal {
    double price;

    public Dog(String name, String breed, String color, int age, double weight, double price) {
        super(name, breed, color, age, weight);
        this.price = price;

    }

    void printInfo() {
        super.printInfo();
        System.out.println(price);

    }
}

class Cat extends Animal {
    public Cat(String name, String breed, String color, int age, double weight) {
        super(name, breed, color, age, weight);
    }

}

class Horse extends Animal {
    public Horse(String name, String breed, String color, int age, double weight) {
        super(name, breed, color, age, weight);
    }


}