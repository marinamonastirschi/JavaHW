package homework;

public class Main {
    String spaceOut(String a){
        for(int i=0;i<a.length();i++){
            a=a.charAt(i)+" ";
        }
        return a;
    }
    public static void main(String[] args){
        Main word=new Main();
        String s=word.spaceOut("hello");
        System.out.println(s);
    }
}
