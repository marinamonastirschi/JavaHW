package class29;

public class E4Methods {
    public static void main(String[] args) {
        E4Methods obj= new E4Methods();
        obj.printHello();
        obj.printWord("Java", 5);
    }
    void printHello(){
        System.out.println("Hello World");
    }
    void printWord(String word, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
        printHello();
    }
}
