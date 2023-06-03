package groupProject;

public class Car {
    double carPrice;
    String color;

    Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}

class Truck extends Car {
    int weight;

    Truck(double carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    public double calculateSalePrice() {
        if (weight < 2000) {
            double discountedPrice = carPrice * 0.1;
            return carPrice - discountedPrice;
        } else {
            double discountedPrice = carPrice * 0.2;
            return carPrice - discountedPrice;
        }
    }
}

class Sedan extends Car {
    double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    public double calculateSalePrice() {
        if (length > 20) {
            double discountedPrice = carPrice * 0.05;
            return carPrice - discountedPrice;
        } else {
            double discountedPrice = carPrice * 0.1;
            return carPrice - discountedPrice;
        }
    }
}

class CarTester {
    public static void main(String[] args) {

        Truck truck = new Truck(40000, "Black", 3000);
        Sedan sedan = new Sedan(50000, "Red", 15);
        System.out.println("Sale price of the truck is: " + truck.calculateSalePrice());
        System.out.println("Sale price of the sedan is: " + sedan.calculateSalePrice());
    }
}
