package class17;

public class DogTester {
    public static void main(String[] args) {
       /* Dog obj1=new Dog();
        obj1.name="Eva";
        obj1.color="Black";
        obj1.breed="Labrador";
        obj1.age=2;
        obj1.printInfo();

        Dog obj2=new Dog();
        obj2.name="Lila";
        obj2.color="White";
        obj2.breed="Bulldog";
        obj2.age=1;
        obj2.printInfo();

        Dog obj3=new Dog();
        obj3.name="Charlie";
        obj3.color="Orange";
        obj3.breed="Chihuahua";
        obj3.age=5;
        obj3.printInfo();*/
        Dog dog1=new Dog("Jack","black","persian",12);
        Dog dog2=new Dog("shaggy","white","husky",8);
        Dog dog3=new Dog("Fluffy","pink","British",7);
        Dog dog4=new Dog("Papi","Brown","Asian",6);
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
    }
}
