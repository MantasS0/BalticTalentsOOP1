package OOP3.Paskaita;

import java.util.Scanner;

public class Paskaita {
    public static void main(String[] args) {
        Person person1 = new Person("Antanas", "Grybelis");
        Person person2 = new Person("Zose", "Katinaite", 29);
        Person person3 = new Person();

/*
        System.out.println(person1.getFullName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getFullName() + " is " + person2.getAge() + " years old.");
        System.out.println(person3.getFullName() + " is " + person3.getAge() + " years old.");

*/

        Scanner input = new Scanner(System.in);



            Person[] personArray = new Person[3];
        personArray[0] = new Person("Person 1", "Surname 1", 15);
        personArray[1] = person1;
        personArray[2] = person2;


        for (int i = 0; i < personArray.length; i++) {
            String nameInput;
            String surnameInput;

            System.out.println("Iveskite " + (i+1) + " zmogaus varda: ");
            nameInput = input.next();
            System.out.println("Iveskite " + (i+1) + " zmogaus pavarde: ");
            surnameInput = input.next();

            personArray[i] = new Person(nameInput,surnameInput);
        }
        input.close();

        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i].getFullName() + " is " + personArray[i].getAge() + " years old.");
        }
    }
}


// namu darbam is skaidriu pabandyti pasiziureti "BubbleSort"
