package class11;

public class E5D2Arrays {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        int sum=0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum=sum+anInt;

                }
            System.out.println(sum);
            sum=0;

            }


        }

    }
