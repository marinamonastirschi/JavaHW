package class14;

public class E2ArrayManipulator {
    /* create a method that will take an int array call it sumArr and return the sum of all the elements from that
    array and then create the object of the class and call the method.
     */
    /*return type should be an int
    name of the method is => sumArr
    parameters => (int[]arr)
    body=>
    {
    got thru all the elements of the array add them and return the results
    }
     */
    int sumArr(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        E2ArrayManipulator obj=new E2ArrayManipulator();
        int [] array={10,20,30};
        int result=obj.sumArr(array);
        System.out.println(result);
    }
}
