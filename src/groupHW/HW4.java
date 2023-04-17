package groupHW;

public class HW4 {
    public static void main(String[] args) {
        /*4. Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array*/

        int[][] numbers={
                {45,8,541,6,25,345},
                {78,945,84,231,1,2957,12}
        };
        for (int[] number : numbers) {
            int sum=0;
            int sum1=0;
            for (int i : number) {
                if(i%2==0){
                    sum=sum+i;
                }else if(i%2==1){
                    sum1=sum1+i;

                }

            }
            System.out.println("Sum of even numbers is "+sum);
            System.out.println("Sum of odd numbers is "+sum1);
        }



    }
}
