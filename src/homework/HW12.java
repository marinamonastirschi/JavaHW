package homework;

public class HW12 {
    public static void main(String[] args) {
        int[][] numbers={
                {45,85,2},
                {87,9,15},
                {6,55,102}
        };
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum=sum+numbers[i][j];


            }

        }
        System.out.println(sum);

    }
}
