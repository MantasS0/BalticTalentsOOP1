package OOP8.Uzduotis;

/*Tarkime yra parduota kažkiek prekių (x) už kažkokią kainą (y) ir tai
sudaro kažkokią sumą (z). Visos šitos sumos yra su PVM 21%.
Parašykite metodą/funkciją kurią iškvietus su parametrais: kiekis, suma
su PVM - ta funkcija atspausdintų pardavimo įrašą tokiu formatu:
1. prekės kaina be PVM (tikslumas ? ženklai po kablelio)
2. kiekis
3. suma be PVM (tikslumas 2 ženklai po kablelio)
4. PVM suma (tikslumas 2 ženklai po kablelio)
5. viso suma su PVM (tikslumas 2 ženklai po kablelio)*/

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Uzduotis {
    public static void main(String[] args) {
        printCheck(5,265.4598);

    }

    private static void printCheck(Integer amount, Double sum) {
        DecimalFormat df1 = new DecimalFormat("######.###");
        df1.setRoundingMode(RoundingMode.UP);
        DecimalFormat df2 = new DecimalFormat("######.##");
        df2.setRoundingMode(RoundingMode.UP);
        Double priceBase = (sum / amount) / 1.21;
        Double sumBase = priceBase * amount;
        Double vat = sumBase * 0.21;

        System.out.println("1. Prekės kaina be PVM " + df1.format(priceBase) + "$");
        System.out.println("2. Kiekis: " + amount);
        System.out.println("3. Suma be PVM: " + df2.format(sumBase) + "$");
        System.out.println("4. PVM suma: " + df2.format(vat) + "$");
        System.out.println("5. Viso suma su PVM: " + df2.format(sum) + "$");
    }
}
