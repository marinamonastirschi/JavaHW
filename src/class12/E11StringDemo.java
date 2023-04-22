package class12;

public class E11StringDemo {
    public static void main(String[] args) {
        String name="Today is Saturday";
        System.out.println(name.indexOf('i'));
        //start searching from index 4
        System.out.println(name.indexOf('a',4));
        System.out.println(name.indexOf('a')+" "+name.indexOf('a',4)+" "+name.indexOf('a',11));
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='a'){
                System.out.print(i+" ");
            }

        }

    }
}
