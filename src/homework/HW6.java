package homework;

public class HW6 {
    public static void main(String[] args) {
        int sum=0;
        int[] integers={5,4,8,45,26,78,95};
        for (int i = 0; i < integers.length; i++) {
            sum=sum+integers[i];


        }
        System.out.println(sum);
        int largestNumber=integers[0];
        for (int j = 0; j < integers.length; j++) {
            if(integers[j]>largestNumber){
                largestNumber=integers[j];

            }
            
        }
        System.out.println(largestNumber);
    }
}
