package class25;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<String> countries= new TreeSet<>();
        countries.add("USA");
        countries.add("Moldova");
        countries.add("Mexico");
        countries.add("Canada");
        System.out.println(countries);
        for(String country: countries){
            System.out.println(country);
        }


    }
}
