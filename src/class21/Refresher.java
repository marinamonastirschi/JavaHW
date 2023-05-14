package class21;

public class Refresher {
    public static void main(String[] args) {
        int number = 10;
        int[] arr = {number, 20, 30};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        String[] names = {"Vlad", "Marina", "Veronica"};
        for (String name : names) {
            System.out.println(name.length());
        }
        Dog dog1 = new Dog("Lal", "Black", "Persian");
        Dog[] dogs = {dog1, new Dog("Papi", "White", "chinese")};

        for (Dog dog : dogs) {
            dog.printInfo();
            System.out.println(dog.name);

        }
    }
}
