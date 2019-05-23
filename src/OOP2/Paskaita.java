package OOP2;

import java.util.Scanner;

public class Paskaita {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("iveskite pirma skaiciu");
        int firstNum = input.nextInt();
        input.nextLine();
        System.out.println("iveskite paskutini skaiciu");
        int lastNum = input.nextInt();
        input.nextLine();
        input.close();


        int sum = 0;
        for (int i = firstNum; i <= lastNum; i++) {
            sum += i;
        }
        System.out.println("Suma nuo " + firstNum + " iki " + lastNum + " yra: " + sum);


    }
}
