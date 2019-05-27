package OOP3.Uzdavinys1;

/*
Tarkime turime masyvą objektų Mokinys.
Reikia atspausdinti mokinių vardus ir pavardes surūšiuotus pagal klases ir pagal pavardes bei vardus.
Pastaba: nustatykite keliems iš vienos klasės mokiniams tas pačias pavardes,
bet skirtingus vardus,kad patikrinti ar gerai rūšiuoja.
*/

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

        System.out.println("Primary list of students:");
        printList(students);
        System.out.println();

        bubbleSortByName(students);

        System.out.println("Sorted list of students:");
        printList(students);

    }

    static void bubbleSortByName(Student array[]) {
        bubbleSortBySurname(array);

        Student tempStudent;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j + 1].surname.equals(array[j].surname) && array[j + 1].name.compareTo(array[j].name) < 0) {
                    tempStudent = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempStudent;
                }
            }
        }
    }

    static void bubbleSortBySurname(Student array[]) {
        bubbleSortByClassName(array);

        Student tempStudent;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j + 1].className.equals(array[j].className) && array[j + 1].surname.compareTo(array[j].surname) < 0) {
                    tempStudent = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempStudent;
                }
            }
        }
    }

    static void bubbleSortByClassName(Student array[]) {
        Student tempStudent;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1].className.compareTo(array[j].className) < 0) {
                    tempStudent = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempStudent;
                }
            }
        }
    }

    static void printList(Student[] students) {
        int i = 1;
        for (Student student : students) {
            System.out.println(i + ". " + student.getFullName() + ". Class: " + student.className);
            i++;
        }
    }


}
