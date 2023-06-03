package class9;

public class E14Arrays {
    public static void main(String[] args) {
        int[] numbers= new int[5];

        numbers[2]=58;
        numbers[0]=50;
        numbers[1]=2;
        numbers[3]=5;
        numbers[4]=65;
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
