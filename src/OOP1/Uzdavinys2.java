package OOP1;

public class Uzdavinys2 {
    public static void main(String[] args) {
/*
        Duotas masyvas {-10, 0, 2, 9, -5}.
        Surūšiuokit masyvo elementus mažėjimo tvarka ir atspausdinkite.
        Nenaudokit standartinės masyvo rūšiavimo funkcijos :)
*/

        int[] array = {-10, 0, 2, 9, -5};
        int[] sortedArray = new int[array.length];

        for (int j = 0; j < array.length; j++) {

            int highestNumberIndex = 0;
            int highestNumber = array[0];
            for (int i = 0; i < array.length; i++) {
                if (highestNumber < array[i]) {
                    highestNumber = array[i];
                    highestNumberIndex = i;
                }
            }

            sortedArray[j] = highestNumber;
            array[highestNumberIndex] = Integer.MIN_VALUE;
        }

        for (int i : sortedArray) {
            System.out.println(i);
        }


    }

}
