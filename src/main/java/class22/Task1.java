package class22;

public class Task1 {
    public static int findNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return 0;
    }

}

class Task1Tester {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3, 6};
        int result = Task1.findNumber(arr, 4);
        System.out.println(result);
    }
}
