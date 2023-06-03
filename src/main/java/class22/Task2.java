package class22;

public interface Task2 {
    public static double averNumb(int[]array){
        double sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum/ array.length;
    }
}
class Task2Tester implements Task2{
    public static void main(String[] args) {
        int[]arr={4,8,5,6};
        System.out.println(Task2.averNumb(arr));
    }
}
