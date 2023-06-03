package class22;

public interface Task3 {
    static int sum(int[] array){
       int sum=0;
        for (int i = 0; i < array.length; i++) {
                sum++;
            }
        return sum;
        }
    }
class Task3Tester implements Task3{
    public static void main(String[] args) {
        int[] array={1,1,1,1,1};
        System.out.println(Task3.sum(array));
    }
}
