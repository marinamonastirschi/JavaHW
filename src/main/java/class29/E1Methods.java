package class29;

public class E1Methods {
    public static void main(String[] args) {
       printWord("Hello World");
       printWord("Hello Java");
       printWord("Hello Batch16");
    }
    static void printWord(String word){
        for (int i = 0; i < 3; i++){
            System.out.println(word);
        }
    }
}
