package class12;

public class DogTester {
    public static void main(String[] args) {
        Dog actualDog= new Dog();
        actualDog.name="Jacky";
        actualDog.age=15;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;

        actualDog.bark();

        Dog obj= new Dog();
        obj.name="Eva";
        obj.age=2;
        obj.breed="Labrador";
        obj.color="Black";
        obj.weight=70;
        obj.isFat=false;

        obj.eat();

    }
}
