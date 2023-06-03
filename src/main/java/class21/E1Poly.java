package class21;

public class E1Poly {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Eva", "black", "Labrador");
        animals[1] = new Cat("Biba", "black", "unknown");
        animals[2] = new Horse("Lil", "brown", "unknown");

        for (int i = 0; i < animals.length; i++) {
            animals[i].printInfo();
            animals[i].speak();
            animals[i].eat();
            animals[i].sleep();

        }
        for (Animal animal : animals) {
            animal.sleep();
            animal.eat();
            animal.speak();
            animal.printInfo();

        }
        Animal animal = new Dog("Eva", "black", "Labrador");
        // we must type cast the animal back to a dog to call the run method
        //as this run method only exists in the Dog class
        Dog d = (Dog) animal;
        d.run();


        // direct way without using a variable
        ((Dog)animal).run();
    }
}
