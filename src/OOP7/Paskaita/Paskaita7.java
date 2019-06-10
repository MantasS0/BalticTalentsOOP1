package OOP7.Paskaita;

import java.util.*;

public class Paskaita7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(11);
        System.out.println(list.size());

        Map<String, Integer> countries = new HashMap<>();
        countries.put("LT", 2800000);
        countries.put("LV", 2100000);
        countries.put("EE", 1500000);

        for (Map.Entry<String, Integer> country : countries.entrySet()) {
            System.out.println(country.getKey() + " " + country.getValue());
        }
        
        countries.forEach((countryCode, population) -> {
            System.out.println("Key: " + countryCode + " Value: " + population);
        });
        String countryCode;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite salies koda: ");
        countryCode = scanner.nextLine();
        scanner.close();
        System.out.println(countries.get(countryCode));

    }
}
