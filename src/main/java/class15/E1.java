package class15;


import java.util.Arrays;

public class E1 {
    // create as method that takes a number call it size as input and creates an array of integers
    //of that size. fill the array with some numbers, let's say 10
    // and returns the array, call the method createArray
    int[] createArray(int size){
        int [] arr=new int [size];
        for (int i = 0; i < size; i++) {
            arr[i]=10;

        }
        return arr;
    }

    public static void main(String[] args) {
        E1 obj=new E1();
        int[] array = obj.createArray(5);
        //System.out.println(Arrays.toString(array));
       // for (int i : array) {
          //  System.out.println(i);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    }

