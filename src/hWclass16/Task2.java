package hWclass16;

public class Task2 {
    /*Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name
     */
    private static String newString(String a){
        StringBuilder b= new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char x=a.charAt(i);
            if(x=='a'||x=='o'||x=='i'||x=='e'||x=='u'){
                b.append(x);
            }
        }
        return b.toString();
    }

    public static void main(String[] args) {
        String s=Task2.newString("ugidakevo");
        System.out.println(s);
    }
}
