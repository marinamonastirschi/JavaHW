package homework;

public class HW11 {
    public static void main(String[] args) {
        String[][] groceryList={
                {"Carrots","Tomatoes","Potatoes","Onions"},
                {"Oranges","Plums","Bananas"},
                {"Milk","Butter","Sour Cream","Yogurt","Heavy Cream"},
                {"Donuts","Cake"}
        };
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+" ");

            }
            System.out.println();


        }
        for (String[] strings : groceryList) {
            for (String string : strings) {
                System.out.print(string+" ");

            }
            System.out.println();

        }
    }
}
