package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class task2 {
    public static void main(String[] args) {
       Map<String, String> countries= new TreeMap<>();
        countries.put("United States","Washington D.C.");
        countries.put("United Kingdom", "London");
        countries.put("Moldova","Chisinau");
        countries.put("France","Paris");
        countries.put("Italy","Rome");

       for(Map.Entry<String, String> c: countries.entrySet()){
           System.out.println(c);
       }
       for(String c: countries.values()){
           System.out.println(c);
       }
       // or var used here instead of typing Map.Entry<String,String>
        for(var e:countries.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
