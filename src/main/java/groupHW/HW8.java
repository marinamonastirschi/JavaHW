package groupHW;

public class HW8 {
    public static void main(String[] args) {
        /*8. Maximum and minimum number in the array?*/

        int[] numbers = {4, 5, 84, 56, 2013, 542};
        int minimum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == minimum) {
                minimum = numbers[i];
                System.out.println("minimum number is " + minimum);

            }


        }
        int maximum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }


        }
        System.out.println("maximum number is " + maximum);
    }
}

