package class23;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("fish");
        words.add("please");
        words.add("route");

        words.removeIf(word -> word.endsWith("e"));

        /*for (int i = 0; i < words.size(); i++) {
            String word=words.get(i);
            if(word.endsWith("e")){
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);

         */
       /* Iterator<String> iterator= words.iterator();
        while(iterator.hasNext()){
            String word= iterator.next();
            if(word.endsWith("e")){
               iterator.remove();
            }
        }
        System.out.println(words);

        */
    }
}
