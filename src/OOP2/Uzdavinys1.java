package OOP2;

public class Uzdavinys1 {
    public static void main(String[] args) {
        /*
        Turime du masyvus int[] a = {5, 6, 10, 15, 8, 4} ir int[] b = {8, 5, 3}.
        Raskite kiekvieno masyvo skaičių vidurkį ir atspausdinkite jų skirtumą. Rezultatas turi gautis: 2.66666...
        */
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};

        System.out.println("Array 1 average: " + getArrayAvg(a));
        System.out.println("Array 2 average: " + getArrayAvg(b));
        System.out.println("Array1Avg - Array2Avg = " + (getArrayAvg(a) - getArrayAvg(b)));
    }

    private static float getArrayAvg(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (float) sum / array.length;
    }
}
