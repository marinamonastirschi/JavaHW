package groupHW;

public class HW10 {
    public static void main(String[] args) {
        /*10. Write a program to print out duplicate elements from
an Array of Strings?*/

        String[] vegetables={"Carrots","Potatoes","Carrots","Tomatoes"};
        for (int i = 0; i < vegetables.length; i++) {
            for (int j = i+1; j < vegetables.length; j++) {
                if(vegetables[i].equals(vegetables[j])){
                    System.out.println(vegetables[j]);
                }

            }

        }
    }
}
