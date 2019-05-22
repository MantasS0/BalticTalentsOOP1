package OOP1;

public class Uzdavinys1 {
    public static void main(String[] args) {
/*
        Duoti trys skaičiai: a, b, c. Nustatykite ar šie skaičiai gali būti trikampio kraštinių ilgiai ir jei gali tai kokio trikampio: lygiakraščio, lygiašonio ar įvairiakraščio.
        Atspausdinkite atsakymą. Kaip pradinius duomenis panaudokite tokius skaičius:
        3, 4, 5
        2, 10, 8
        5, 6, 5
        5, 5, 5

        Apskaičiuokite ir atspausdinkite šių trikampių plotus
        Spausdinimui naudokite:System.out.println("Plotas=" + plotas);
*/
        int[][] triangles = {{3, 4, 5}, {2, 10, 8}, {5, 6, 5}, {5, 5, 5}};

        for (int i = 0; i < triangles.length; i++) {
            System.out.println("Triangle NO. " + (i + 1) + " sides are: " + triangles[i][0] + ", " + triangles[i][1] + ", " + triangles[i][2] + ";");

            if (isTriangle(triangles[i])) {

                int halfPerimeter = (triangles[i][0] + triangles[i][1] + triangles[i][2]) / 2;
                float area = (float) Math.sqrt(halfPerimeter * (halfPerimeter - triangles[i][0]) * (halfPerimeter - triangles[i][1]) * (halfPerimeter - triangles[i][2]));
                String areaString = String.format("%.2f", area);

                if (triangles[i][0] == triangles[i][1] && triangles[i][0] == triangles[i][2]) {
                    System.out.println("Triangle NO. " + (i + 1) + " is equilateral (lygiasonis).");
                } else if (triangles[i][0] == triangles[i][1] || triangles[i][0] == triangles[i][2] || triangles[i][1] == triangles[i][2]) {
                    System.out.println("Triangle NO. " + (i + 1) + " is isosceles (lygiakrastis).");
                } else {
                    System.out.println("Triangle NO. " + (i + 1) + " is scalene (ivairiakrastis).");
                }
                System.out.println("Triangle NO. " + (i + 1) + " area is: " + areaString);
            } else {
                System.out.println("ERROR: The triangle NO." + (i + 1) + " does not exist");
            }
            System.out.println();
        }

    }

    private static boolean isTriangle(int[] triangle) {
        if (triangle[0] + triangle[1] <= triangle[2] || triangle[0] + triangle[2] <= triangle[1] || triangle[1] + triangle[2] <= triangle[0])
            return false;
        else
            return true;
    }
}
