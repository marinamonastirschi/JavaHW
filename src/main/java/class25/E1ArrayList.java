package class25;

import class12.Dog;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
       /* ArrayList<String> names= new ArrayList<>();
        String name= "I am sorry what";
        names.add(name); */
        // creating the object of car class storing it in variable car1
        Car car1= new Car("Toyota", "Prius");
        Car car2= new Car("Honda", "Civic");
        Car car3= new Car("BMW", "I7");
        ArrayList<Car> cars= new ArrayList<>();
        //cars.add(new Car()); // creating object of dog class and storing it in arrayList
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        for(Car c: cars){
            c.printInfo();
        }


    }
}
class Car{
    String make;
    String model;
    Car(String make, String model){
        this.make=make;
        this.model= model;
    }
    void printInfo(){
        System.out.println(make+" "+model);
    }
}
