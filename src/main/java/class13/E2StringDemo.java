package class13;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="njkDASDF22234$#$$%";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[a-z0-9]","%"));
        System.out.println(str.replaceAll("[a-zA-Z]","#"));
        System.out.println(str.replaceAll("[a-z-k]","#"));
        System.out.println(str.replaceAll("[A-z]","#"));
        System.out.println(str.replaceAll("[#-z]","#"));

        char c='a';
        System.out.println(c);
        for (int i = 0; i < 10; i++) {
            System.out.println(c++);
        }

    }
}
