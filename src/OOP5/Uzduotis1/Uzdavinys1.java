package OOP5.Uzduotis1;

/*
Tarkime turime masyvą objektų Mokinys.
Reikia atspausdinti mokinių klasės numerį bei vardus ir pavardes su jų trimestro vidurkiu
pagal klases vidurkio mažėjimo tvarka.
*/

import java.util.Random;

public class Uzdavinys1 {
    public static void main(String[] args) {

        Student.addStudent(new Student("Petras", "Grybauskas", "3B"));
        Student.addStudent(new Student("Antanas", "Grybauskas", "3B"));
        Student.addStudent(new Student("Zose", "Katinaite", "2A"));
        Student.addStudent(new Student("Ignas", "Liutukas", "1C"));
        Student.addStudent(new Student("Remigijus", "Aukstasis", "2A"));
        Student.addStudent(new Student("Ruta", "Saulyte", "1C"));
        Student.addStudent(new Student("Inga", "Bertasiute", "3B"));
        Student.addStudent(new Student("Linas", "Kairys", "2A"));
        Student.addStudent(new Student("Ausra", "Lapinskaite", "1A"));
        Student.addStudent(new Student("Inga", "Putpelaite", "1A"));

        addRandomGrades(Student.getStudents());

        System.out.println("Primary list of students:");
        Student.printStudentList();
        System.out.println();

        Student.bubbleSortStudents();

        System.out.println("Sorted list of students:");
        Student.printStudentList();


        System.out.println("Different Classes are:");
        Student.printClasesAverages();

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


}
