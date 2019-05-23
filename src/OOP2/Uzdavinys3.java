package OOP2;

import java.util.Scanner;

public class Uzdavinys3 {
    public static void main(String[] args) {
        /*
        Parasyti programa, kuri suranda skaiciaus pakelto laipsniu rezultata. Nenaudojant JAVA Math funkciju. Naudoti cikla!
            int skaicius = 5;
            int laipsnis = 6;
*/
        Scanner input = new Scanner(System.in);

        int number;
        int pow;

        while (true) {
        System.out.print("Iveskite sveika skaiciu: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                input.nextLine();
                break;
            } else {
                System.out.println("Ivestas netinkamas skaicius");
                input.nextLine();
            }
        }

        while (true) {
        System.out.print("Iveskite laipsni (sveika skaiciu): ");
            if (input.hasNextInt()) {
                pow = input.nextInt();
                input.nextLine();
                break;
            } else {
                System.out.println("Ivestas netinkamas skaicius");
                input.nextLine();
            }
        }
        input.close();

        int result = number;

        for (int i = 1; i < pow; i++) {
            result *= number;
        }
        System.out.printf("%d pakeltas %d laipsniu yra: %d", number,pow,result);

    }
}
