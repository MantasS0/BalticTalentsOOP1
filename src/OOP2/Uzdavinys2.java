package OOP2;

public class Uzdavinys2 {
    public static void main(String[] args) {
        /*
         * Tobuluoju skaičiumi vadinamas natūralusis skaičius, lygus visų savo daliklių, mažesnių už save patį, sumai. pvz 28 = 1 + 2 + 4 + 7 + 14
         * Suraskite visus tokius skaičius iš intervalo 1...1000
         */
        System.out.println("Perfect numbers are:");

        for (int i = 1; i <= 1000; i++) {
            if (isPerfectNumber(i)){
                System.out.print(i + " ");
            }
        }

    }

    private static boolean isPerfectNumber(int number) {
        int dividablesSum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                dividablesSum += i;
            }
        }
//        System.out.println("Number: " + number + "\n" +
//                "Dividable sum: " + dividablesSum);
        if (number == dividablesSum) {
            return true;
        }
        return false;
    }

}
