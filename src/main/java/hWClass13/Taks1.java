package hWClass13;

public class Taks1 {
    public static void main(String[] args) {
        String sentence="This is sentence i want to reverse";
        StringBuilder sentence2=new StringBuilder(sentence);
        sentence2.reverse();
        sentence=sentence2.toString();
        System.out.println(sentence);
    }
}
