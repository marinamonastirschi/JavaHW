package homework;

import java.util.LinkedList;
import java.util.List;

public class Replit189 {
    public static void main(String[] args) {
        List<Integer> objects= new LinkedList<>();
        for(int i=50; i<=100; i++){
            objects.add(i);
        }
        objects.removeIf(x->x%3!=0);
        System.out.println(objects);
    }
    }
