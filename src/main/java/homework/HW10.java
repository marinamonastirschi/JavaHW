package homework;

public class HW10 {
    public static void main(String[] args) {
        String[][] cars={
            {"Ford","Lincoln","Chevrolet","GMC"},
            {"BMW","Mercedes","Porsche","Audi"},
            {"Kia","Hyundai","Genesis"},
            {"Fiat","Lancia","Maserati","Ferrari","Alfa Romeo"}
        };
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");

            }
            System.out.println();

        }
        for (String[] car : cars) {
            for (String s : car) {
                System.out.print(s+" ");

            }

        }

    }
}
