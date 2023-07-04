package class29;

import java.util.ArrayList;
import java.util.List;

public class E5Methods {
    public static void main(String[] args) {
        E5Methods obj= new E5Methods();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(10);
        obj.print(list);
    }
   void print(List<Integer>list){
       for (Integer l: list) {
           System.out.println(l);
       }
   }
}
