package class24;

import class18.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E16ArrayList {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(0, i);
            System.out.println(numbers);
        }
long end=System.currentTimeMillis();
        System.out.println(end-start);

    }
}
