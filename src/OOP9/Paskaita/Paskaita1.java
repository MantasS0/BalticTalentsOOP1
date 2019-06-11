package OOP9.Paskaita;

/*
        Map<Integer, String> menesiuVardai = new HashMap<>();
        menesiuVardai.put(1, "Sausis");
        menesiuVardai.put(2, "Vasaris");
        menesiuVardai.put(3, "Kovas");
        menesiuVardai.put(4, "Balandis");
        menesiuVardai.put(5, "Gegužė");
        menesiuVardai.put(6, "Birželis");
        menesiuVardai.put(7, "Liepa");
        menesiuVardai.put(8, "Rugpjutis");
        menesiuVardai.put(9, "Rugsėjis");
        menesiuVardai.put(10, "Spalis");
        menesiuVardai.put(11, "Lapkritis");
        menesiuVardai.put(12, "Gruodis");

        Map<Integer, Integer> menesiuDienos = new HashMap<>();
        menesiuDienos.put(1, 31);
        menesiuDienos.put(2, 28);
        menesiuDienos.put(3, 31);
        menesiuDienos.put(4, 30);
        menesiuDienos.put(5, 31);
        menesiuDienos.put(6, 30);
        menesiuDienos.put(7, 31);
        menesiuDienos.put(8, 31);
        menesiuDienos.put(9, 30);
        menesiuDienos.put(10, 31);
        menesiuDienos.put(11, 30);
        menesiuDienos.put(12, 31);
*/

import java.util.HashMap;
import java.util.Map;

public class Paskaita1 {
    public static void main(String[] args) {

        Map<Integer, String> menesiuVardai = new HashMap<>();
        menesiuVardai.put(1, "Sausis");
        menesiuVardai.put(2, "Vasaris");
        menesiuVardai.put(3, "Kovas");
        menesiuVardai.put(4, "Balandis");
        menesiuVardai.put(5, "Gegužė");
        menesiuVardai.put(6, "Birželis");
        menesiuVardai.put(7, "Liepa");
        menesiuVardai.put(8, "Rugpjutis");
        menesiuVardai.put(9, "Rugsėjis");
        menesiuVardai.put(10, "Spalis");
        menesiuVardai.put(11, "Lapkritis");
        menesiuVardai.put(12, "Gruodis");

        Map<Integer, Integer> menesiuDienos = new HashMap<>();
        menesiuDienos.put(1, 31);
        menesiuDienos.put(2, 28);
        menesiuDienos.put(3, 31);
        menesiuDienos.put(4, 30);
        menesiuDienos.put(5, 31);
        menesiuDienos.put(6, 30);
        menesiuDienos.put(7, 31);
        menesiuDienos.put(8, 31);
        menesiuDienos.put(9, 30);
        menesiuDienos.put(10, 31);
        menesiuDienos.put(11, 30);
        menesiuDienos.put(12, 31);


        int metDienSum = 0;
        for (int i = 31; i >= 28; i--) {
            int menSum = 0;
            StringBuilder menName = new StringBuilder("");

            for (int j = 1; j <= menesiuVardai.size(); j++) {
                if (menesiuDienos.get(j) == i) {
                    menSum++;
                    menName.append(menesiuVardai.get(j) + ", ");
                }
            }

            if (!menName.toString().equals("")) {
                menName.deleteCharAt(menName.length()-1);
                menName.deleteCharAt(menName.length()-1);
//                menName.delete(menName.length()-2,menName.length()-1);
                metDienSum += menSum * i;
                System.out.println("Metuose yra " + menSum + " menesiai turintys " + i + "d. (" + menName + ")");
            }

        }

        System.out.println("Viso metuose yra " + metDienSum + " dienos.");

    }


}
