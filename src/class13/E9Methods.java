package class13;

public class E9Methods {
    void printSomething(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

    }
    void printWord(String word){
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
    }
    void printWordManyTimes(String word,int number){
        for (int i = 0; i < number; i++) {
            System.out.print(word+" ");

        }
    }

}
