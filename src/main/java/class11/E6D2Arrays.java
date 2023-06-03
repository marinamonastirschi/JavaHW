package class11;

public class E6D2Arrays {
    public static void main(String[] args) {
        boolean[][] arr2D = {
                {true,false,true,true,false},
                {true,false,false,false,false},
        };
        int sum=0;
        for (boolean[] booleans : arr2D) {
            for (boolean aBoolean : booleans) {
                if(aBoolean){
                    sum++;
                }

            }

        }
        System.out.println(sum);

            }


        }

