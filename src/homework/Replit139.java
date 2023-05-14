package homework;

public class Replit139 {
    public static String alphabetical(String str){
        String str1="";

        for(int i=0; i<str.length();i++){
            if(i==0 || str.charAt(i)>str.charAt(i-1)){
                str1+=str.charAt(i);
            }
        }
        return str1;
    }
    public static void main(String[]args){
        System.out.println(Replit139.alphabetical("hello"));
        System.out.println(Replit139.alphabetical("software"));
        System.out.println(Replit139.alphabetical("language"));
    }
}
