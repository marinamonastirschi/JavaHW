package groupHW;

public class HW9 {
    public static void main(String[] args) {
        /*9. Write a java program to find the second-largest
number in the array?*/

        int[]numbers={45,824,56,2564,10003};
        int a;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i]>numbers[j]){
                    a=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=a;

                }

            }

        }
        System.out.println(numbers[numbers.length-2]);

    }
}
