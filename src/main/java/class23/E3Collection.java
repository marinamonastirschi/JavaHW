package class23;

import java.util.ArrayList;

public class E3Collection {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Moncef");
        names.add("Vlad");
        names.add("Axel");
        names.add("Adam");
        names.add("Marina");
        names.add("Farwa");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Vlad"));
        System.out.println(names.get(0));
        names.remove("Vlad");
        System.out.println(names);
        System.out.println(names.indexOf("Marina"));

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
