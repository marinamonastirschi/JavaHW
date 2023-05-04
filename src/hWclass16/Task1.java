package hWclass16;

public class Task1 {
    /*Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
     */
    static String revString(String s){
        StringBuilder s1=new StringBuilder(s);
        s1.reverse();

        return s1.toString();
    }

}
