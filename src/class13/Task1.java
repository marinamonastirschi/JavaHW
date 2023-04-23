package class13;

public class Task1 {
    public static void main(String[] args) {
        String sentence="We like java";
        System.out.println(sentence.replaceAll(" ",""));


        String str="SDSDFfgfg4556%^%$";
        str=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str);
        System.out.println(str.length());


        String a="Is it Saturday?Is it raining?Do we have Java Class today?";
        String[] aArr=a.split("[?]");
        System.out.println(aArr.length);
        for (int i = 0; i < aArr.length; i++) {
            System.out.println(aArr[i]);
        }

        }

}
