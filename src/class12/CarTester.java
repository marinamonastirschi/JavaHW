package class12;

public class CarTester {
    public static void main(String[] args) {
        Car car=new Car();
        car.color="Red";
        car.mileage=10000;
        car.make="Toyota";
        car.model="Camry";
        car.year=2020;

        car.drive();
        car.heats();
        car.signals();
    }
}
