package class23;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 2; i <= 500; i=i+2) {
            numbers.add(i);
        }
        System.out.println(numbers);
        numbers.removeIf(x->x%5==0);
        System.out.println(numbers);
    }
}
