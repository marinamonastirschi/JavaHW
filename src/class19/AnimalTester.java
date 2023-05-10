package class19;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Eva", "Labrador", "black", 3, 50.5, 100);
        Cat cat = new Cat("Biba", "unknown", "black", 1, 5);
        Horse horse = new Horse("Nem", "unknown", "brown", 4, 51.3);
        dog.printInfo();
        cat.printInfo();
        horse.printInfo();

    }
}
