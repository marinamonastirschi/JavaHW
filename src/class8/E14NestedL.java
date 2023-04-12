package class8;

public class E14NestedL {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
            for (i = 0; i < 1; i++) {
                for (int j = 2; j <= 6; j++) {
                    System.out.print(j+" ");

                }
                System.out.println();
                for ( i = 0; i < 1; i++) {
                    for (int j = 3; j <=7 ; j++) {
                        System.out.print(j+" ");

                    }
                    System.out.println();

                }

            }

        }
    }
}
