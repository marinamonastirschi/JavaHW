package class25;

import java.util.ArrayList;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {


        Headset obj1 = new Headset("Razer Nari Ultimate", 79.99, 4620);
        Headset obj2 = new Headset("New SteelSeries Arctis", 52.64, 4868);
        Headset obj3 = new Headset("HyperX cloud II", 0, 32116);


        // we can store the objects of a class in a variable who's type is interface
        List<Headset> headsets = new ArrayList<>();
        headsets.add(obj1);
        headsets.add(obj2);
        headsets.add(obj3);
        for(Headset h: headsets){
            h.printInfo();
        }


    }
    public static void printList(List<Headset> headsets){
        for(Headset h: headsets){
            h.printInfo();
        }

    }
}
class Headset{
    private String title;
    private double price;
    private int noOfReviews;

    public Headset(String title, double price, int noOfReviews) {
        this.title = title;
        this.price = price;
        this.noOfReviews = noOfReviews;
    }
    public void printInfo(){
        System.out.println(title+" "+price+" "+noOfReviews);
    }
}
