package class23;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {
        int num = 10;
        int number = 20;
        ArrayList<Integer> numbers= new ArrayList<>();
        // datatype is being converted automatically from int to Integer (auto boxing)
        numbers.add(num);
        numbers.add(number);
        System.out.println(numbers.get(0));
        // datatype is being converted automatically from Integer to int (auto unboxing)
        int number3= numbers.get(0);

    }
}
