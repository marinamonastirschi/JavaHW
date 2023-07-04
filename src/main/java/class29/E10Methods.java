package class29;

public class E10Methods {
    /*
    create a method that will take an array of ints and will return the sum of the elements of the array
    method should be accessible thru the project and methods should be callable by just writting the name of the class
     */

    public static int sum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1,};
        System.out.println(sum(arr));
    }
}
