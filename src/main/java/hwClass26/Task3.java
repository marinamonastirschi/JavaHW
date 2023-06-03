package hwClass26;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {

        LinkedHashSet<String> fruits = new LinkedHashSet<String>();
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Mango");

        String concat="";
        for(String fruit:fruits){
            concat+=fruit;
        }
        System.out.println(concat);
    }
}