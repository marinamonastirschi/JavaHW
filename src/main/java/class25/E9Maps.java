package class25;

import java.util.*;

public class E9Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup=new TreeMap<>();
        makeup.put("Lipstick",100.0);
        makeup.put("Blush",20.0);
        makeup.put("EyeLiner",50.5);
        makeup.put("Foundation",120.0);
        makeup.put("Base",25.0);

       Set<String> keys= makeup.keySet();
        System.out.println(keys);
       Collection<Double> values= makeup.values();
    }
}
