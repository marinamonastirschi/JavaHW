package class26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer,String> items=new HashMap<>();
        items.put(15245,"Printer");
        items.put(56224,"TV");
        items.put(84565,"Computer");
        items.put(65478,"Phone");

        for (Map.Entry<Integer, String> item: items.entrySet()){
            System.out.println(item);
        }
    }
}
