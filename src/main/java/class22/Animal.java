package class22;

public abstract class Animal {
    private String name;
    private String color;
    private String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    abstract void speak();
    abstract void eat();
    abstract void sleep();
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
}
class Dog extends Animal{
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak(){
        System.out.println("Dog goes *bark*");
    }
    @Override
    void eat(){
        System.out.println("Dog likes to eat dog food");
    }
    @Override
    void sleep(){
        System.out.println("Dog sleeps 8 hours per day");
    }
}
class Cat extends Animal{
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak(){
        System.out.println("Cat goes *meow*");
    }
    @Override
    void eat(){
        System.out.println("Cat likes to eat cat food");
    }
    @Override
    void sleep(){
        System.out.println("Cat sleeps 10 hours per day");
    }
        }
class Horse extends Animal{
    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak(){
        System.out.println("Horse goes neigh");
    }
    @Override
    void eat(){
        System.out.println("Horse likes to eat carrots");
    }
    @Override
    void sleep(){
        System.out.println("Horse sleeps 4 hours per day");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Animal [] animals={new Dog("jacky","black","labrador")
                ,new Cat("Biba","Brown","persian")
                ,new Horse("Lol","gray","unknown")};
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.speak();
            animal.printInfo();

        }
    }
}
