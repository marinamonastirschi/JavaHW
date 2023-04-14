package homework;

public class HW14 {
    public static void main(String[] args) {
        String[][] countries={
                {"Argentina","Brazil","Chile","Peru","Colombia"},
                {"United States","Canada","Mexico","Cuba"},
                {"Italy","France","Germany","Greece","Switzerland"},
                {"Japan","India","Thailand","South Korea"},
                {"South Africa","Ethiopia","Angola","Nigeria","Burundi","Algeria"}
        };
        int sum=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                sum++;

            }

            System.out.println();

        }
        System.out.println(sum);
        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s+" ");

            }
            System.out.println();

        }
    }
}
