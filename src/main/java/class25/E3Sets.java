package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Farwa");
        names.add("Farwa");
        System.out.println(names);
// HashSet does not only allow duplicates and does not remember the insertions order
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Yellow");
        uniqueNames.add("Yellow");
        uniqueNames.add("green");
        // there is no get method in sets (uniqueNames.get(0)
        // cant use for loop and while loop
        System.out.println(uniqueNames);
    }
}
