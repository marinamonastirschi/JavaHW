package homework;

public class Replit168 {
    final String m1(String word){
        StringBuilder word1= new StringBuilder(word);
        word1.reverse();
        word=word1.toString();
        return word;
    }

    public static void main(String[] args) {
        Replit168 obj=new Replit168();
        obj.m1("hello");
    }
}
