package homework;

public class HW13 {
    public static void main(String[] args) {
        int[][] numbers={
                {4,84,53,109},
                {87,111,20,56},
                {95,2645,852,1}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]);
                }

            }

        }
    }
}
