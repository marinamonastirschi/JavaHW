package class24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class E13ArrayList {
    public static void main(String[] args) {
        List<Integer> names= new ArrayList<>();
        List<String> names2= new LinkedList<>();
        names.add(10);
        names.add(20);
        names.add(44);
        names.add(50);
        names.add(100);
        System.out.println(names);
        names.add(1,500);
        System.out.println(names);
        names.remove(2);
        System.out.println(names);

    }
}
