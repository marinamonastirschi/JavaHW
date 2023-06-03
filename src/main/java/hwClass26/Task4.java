package hwClass26;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int sum=0;
        for (Integer num:numbers){
            sum+=num;
        }
        System.out.println(sum);
    }
}
