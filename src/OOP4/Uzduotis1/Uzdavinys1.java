package OOP4.Uzduotis1;

/*
Tarkime turime masyvą objektų Mokinys.
Reikia atspausdinti mokinių klasės numerį bei vardus ir pavardes su jų trimestro vidurkiu
pagal klases vidurkio mažėjimo tvarka.
*/

import java.util.Random;

public class Uzdavinys1 {
    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student("Petras", "Grybauskas", "3B");
        students[1] = new Student("Antanas", "Grybauskas", "3B");
        students[2] = new Student("Zose", "Katinaite", "2A");
        students[3] = new Student("Ignas", "Liutukas", "1C");
        students[4] = new Student("Remigijus", "Aukstasis", "2A");
        students[5] = new Student("Ruta", "Saulyte", "1C");
        students[6] = new Student("Inga", "Bertasiute", "3B");
        students[7] = new Student("Linas", "Kairys", "2A");
        students[8] = new Student("Ausra", "Lapinskaite", "1A");
        students[9] = new Student("Inga", "Putpelaite", "1A");

        addRandomGrades(students);

        System.out.println("Primary list of students:");
        printList(students);
        System.out.println();

        bubbleSort(students);

        System.out.println("Sorted list of students:");
        printList(students);

    }

    static void bubbleSort(Student array[]) {
        Student tempStudent;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j + 1].getClassName().compareTo(array[j].getClassName()) < 0) {
                    tempStudent = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempStudent;
                } else if (array[j + 1].getClassName().equals(array[j].getClassName()) && array[j + 1].getAverage() > array[j].getAverage()) {
                    tempStudent = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempStudent;
                } else if (array[j + 1].getAverage() == array[j].getAverage() && array[j + 1].getSurname().compareTo(array[j].getSurname()) < 0) {
                    tempStudent = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempStudent;
                } else if (array[j + 1].getSurname().equals(array[j].getSurname()) && array[j + 1].getName().compareTo(array[j].getName()) < 0) {
                    tempStudent = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempStudent;
                }
            }
        }
    }

    static void addRandomGrades(Student array[]) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            System.out.print("Adding grades to " + array[i].getFullName() + ": ");
            for (int j = 0; j < array[i].getGrades().length; j++) {
                array[i].addGrade(random.nextInt((10 - 1) + 1) + 1);
                System.out.print(array[i].getGrades()[j]);
                if (j < array[i].getGrades().length - 1) {
                    System.out.print(", ");
                }else {
                    System.out.print(".");
                }
            }
            array[i].countAverage();
            System.out.println("\n");
        }
    }

    static void printList(Student[] students) {
        int i = 1;
        for (Student student : students) {
            System.out.println(i + ". " + student.getFullName() + ". Class: " + student.getClassName() + ". Average: " + student.getAverage());
            i++;
        }
    }

}
