package class9;

public class E5Arrays {
    public static void main(String[] args) {
        String[] names={"Joe","Sarah","Veronica","Nick","Livia"};
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");

        }
        System.out.println();
        int j=0;
        while(j<names.length) {
            System.out.print(names[j]+" ");
            j++;
        }
    }
}
