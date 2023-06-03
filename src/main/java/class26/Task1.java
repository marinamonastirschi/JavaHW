package class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        /*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map*/
        Map<Integer, String> building= new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Facebook");
        building.put(4,"Replit");
        building.put(5,"Canvas");
        building.put(6,"Zoom");
        building.put(7,"Apple");

       int size= building.size();
        System.out.println(size);
        building.replace(4,"Amazon");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);
    }
}
