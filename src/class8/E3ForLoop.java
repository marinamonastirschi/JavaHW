package class8;

    public class E3ForLoop {
    public static void main(String[] args) {
        int sum=0;
        for (int number=1; number<=30; number++){
            if(number%2==0){
                sum+=number; //sum=sum+number;
            }


        }
        System.out.println(sum);
    }
}
