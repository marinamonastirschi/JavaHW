package class9;

public class E7Arrays {
    public static void main(String[] args) {
        System.out.println();
        char[] num = {'a', 'b', 'c'};
        for (int j = 0; j < num.length; j++) {
            if (j % 2 == 0) {
                System.out.print(num[j] + " ");
            }
        }
    }
}

