package groupHW;

public class HW1 {
    public static void main(String[] args) {
        /*1. Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.*/

        int[]temperature={21,15,10,31,26,9,17};
        int highestTemperature=temperature[0];
        int lowestTemperature=temperature[0];
        for (int i = 0; i < temperature.length; i++) {
                if(temperature[i]>highestTemperature) {
                    highestTemperature=temperature[i];
                }else if(temperature[i]<lowestTemperature){
                    lowestTemperature=temperature[i];
                }

            }
            System.out.println(highestTemperature);
        System.out.println(lowestTemperature);

        }

    }
