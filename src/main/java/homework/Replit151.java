package homework;

public class Replit151 {
    static int sum2D(int [][] arr){
        int sum=0;
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
class Mai extends Replit151{
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum2D = Replit151.sum2D(a);
        System.out.println(sum2D);


    }
}
