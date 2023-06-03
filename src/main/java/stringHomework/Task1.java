package stringHomework;

public class Task1 {
    public static void main(String[] args) {
        /*Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
For Example String str=hello =>l*/

        String name="Alice";
            if(!name.isBlank()&&name.length()%2!=0&&name.length()>=3){
                int middleIndex=name.length()/2;
                char middleChar=name.charAt(middleIndex);
                System.out.println(middleChar);

        }
    }
}
