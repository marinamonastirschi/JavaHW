package class25;

import java.util.LinkedHashSet;

public class Task3 {
    /*Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        LinkedHashSet<String> cities= new LinkedHashSet<>();
        cities.add("Chicago");
        cities.add("Arlington Heights");
        cities.add("Huntley");
        cities.add("Algonquin");

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
    }
}
