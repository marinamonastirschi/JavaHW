package class14;

public class E5ArrayUtilsTester {
    public static void main(String[] args) {
        E5ArrayUtils obj=new E5ArrayUtils();
        int [] arr={10,20,45};
        int number=20;
        boolean result= obj.contains(arr,number);
        System.out.println(result);

    }
}
