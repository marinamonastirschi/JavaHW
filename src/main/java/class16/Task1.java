package class16;

public class Task1 {
   int m1(int[]num){
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];

        }
        return sum;
    }

    public static void main(String[] args) {
       Task1 obj=new Task1();
       int[] arr={1,1,1,1};
       int sum=obj.m1(arr);
        System.out.println(sum);
    }
}
