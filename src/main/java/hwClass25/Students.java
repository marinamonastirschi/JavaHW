package hwClass25;

import java.util.HashSet;

public class Students {
    public static void main(String[] args) {
        HashSet<String> students= new HashSet<>();
        students.add("John");
        students.add("Alice");
        students.add("Livia");
        System.out.println(students);
    }
    String name;
    int id;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
