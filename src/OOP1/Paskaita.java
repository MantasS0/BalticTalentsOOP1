package OOP1;

public class Paskaita {

    public static void main(String[] args) {
/*
        Uzdavinys:
        turime skaiciu masyva {100, 200, -100, 0, 5, 10};
        Parasyti programa kuri surastu didziiausia ir maziausia skaiciu masyve
*/

        int[] array = {100, 200, -100, 0, 5, 10};
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Min value of the array is: " + min + "\n" +
                "Max value of the array is: " + max);

    }
}
