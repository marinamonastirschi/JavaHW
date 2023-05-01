package class15;

public class E3 {
    // create a method that takes an array as input, It adds all the numbers
    //from the array and returns the sum. name of the method should be sumArr
    int sumArr(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=arr[i]+sum;

        }
        return sum;
    }

    public static void main(String[] args) {
        E3 obj=new E3();
        int[] array={10,10,10};
        int res=obj.sumArr(array);
        System.out.println(res);

    }
}
