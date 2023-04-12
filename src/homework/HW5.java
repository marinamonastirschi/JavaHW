package homework;

public class HW5 {
    public static void main(String[] args) {
        String[] animals={"Cat","Dog","Mouse","Cow","Rabbit"};
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]+" ");

        }
        System.out.println();
        for (String animal : animals) {
            System.out.print(animal+" ");

        }

    }
}
