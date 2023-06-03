package class23;

import java.util.ArrayList;

public class E12ArrayList {
    public static void main(String[] args) {
        ArrayList<String>drinks= new ArrayList<>();
       drinks.add("Coke");
       drinks.add("coffee");
       drinks.add("Water");
       drinks.add("juice");

        for (int i = 0; i < drinks.size(); i++) {
            String word=drinks.get(i);
            if(word.contains("a")|| word.contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);

    }
}
