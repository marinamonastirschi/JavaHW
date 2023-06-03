package class7;

public class HW4 {
    public static void main(String[] args) {
        int i = 20;
        while (i <= 50) {
            if (i % 2 == 1) {
                System.out.print(i + " ");

            }
            i++;
        }
        System.out.println();
        for (i = 20; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
