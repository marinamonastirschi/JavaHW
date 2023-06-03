package class23;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Alice");
        names.add("Nick");
        names.add("Rick");
        names.add("John");
        names.add("Jane");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("John"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
