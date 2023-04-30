package class14;

public class E4ArrayUtils {
    int add(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        E4ArrayUtils obj= new E4ArrayUtils();
        /*we are calling the method on obj object and passing 2 arguments
        one is 15 other is 20 and storing the results from method call into the sum variable

         */
        int sum= obj.add(15,20);
        System.out.println(sum);

    }
}
