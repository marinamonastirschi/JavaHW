package stringHomework;

public class Task1 {
    public static void main(String[] args) {
        /*Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
For Example String str=hello =>l*/

        String name="Alice";
        for (int i = 0; i < name.length(); i++) {
            if(name.length()%2!=0&&name.length()>=3){
                System.out.println(name.charAt(2));
                break;
            }

        }
    }
}
