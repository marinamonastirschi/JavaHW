package groupHW;

public class HW2 {
    public static void main(String[] args) {
        /*2. Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.*/

        int[]numbers={45,87,1556,25,36,782};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];

        }
        System.out.println(sum);

    }
}
