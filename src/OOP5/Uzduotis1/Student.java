package OOP5.Uzduotis1;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person {

    private static Student[] students = new Student[10];
    private static int studentCount = 0;

    private String className;
    private double average;
    private int[] grades = new int[10];
    private int gradesCount;


    public Student(String name, String surname, String className) {
        super(name, surname);
        this.className = className;
        this.gradesCount = 0;
    }

    public String getClassName() {
        return className;
    }

    public double getAverage() {
        return average;
    }

    public int[] getGrades() {
        return grades;
    }

    public int getGradesCount() {
        return gradesCount;
    }

    public static Student[] getStudents() {
        return Student.students;
    }

    public static void addStudent(Student student) {
        Student.students[studentCount] = student;
        Student.studentCount++;
    }

    public void addGrade(int grade) {
        if (this.gradesCount < this.grades.length) {
            this.grades[gradesCount] = grade;
            this.gradesCount++;
        } else {
            System.out.println("Reached maximum grades allowed");
        }
    }

    public void countAverage() {
        double gradesSum = 0;
        for (int i = 0; i < gradesCount; i++) {
            gradesSum += this.grades[i];
        }
        this.average = gradesSum / this.gradesCount;
    }

    public static ArrayList<String> getClassNames() {
        ArrayList<String> classNames = new ArrayList<String>();
        for (int i = 0; i < Student.students.length; i++) {
            for (String name : classNames) {
                if (!Arrays.asList(Student.students[i].className).contains(name)) {
                    classNames.add(Student.students[i].className);
                    System.out.println("New Class " + Student.students[i].getClassName() + " is detected");
                }else {
                    System.out.println("The class name list already contains the name of " + name);
                }
            }
        }
        return classNames;
    }

    public static ArrayList<Integer> getStudentsInClassIndexes(String className) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < Student.students.length; i++) {
            if (Student.students[i].className.equals(className)) {
                indexes.add(i);
                System.out.println(Student.students[i].getFullName() + " is in class " + Student.students[i].getClassName());
            }
        }
        return indexes;
    }

    public static void printClasesAverages(){

        ArrayList<String> classNames = Student.getClassNames();

        for (String className : classNames) {
            System.out.println(className);
        }
    }

    public static void printStudentList() {
        int i = 1;
        for (Student student : Student.students) {
            System.out.println(i + ". " + student.getFullName() + ". Class: " + student.getClassName() + ". Average: " + student.getAverage());
            i++;
        }
    }

    public static void bubbleSortStudents() {
        Student tempStudent;

        for (int i = 0; i < Student.students.length - 1; i++) {
            for (int j = 0; j < Student.students.length - i - 1; j++) {

                if (Student.students[j + 1].getClassName().compareTo(Student.students[j].getClassName()) < 0) {
                    tempStudent = Student.students[j];
                    Student.students[j] = Student.students[j + 1];
                    Student.students[j + 1] = tempStudent;
                } else if (Student.students[j + 1].getClassName().equals(Student.students[j].getClassName()) && Student.students[j + 1].getAverage() > Student.students[j].getAverage()) {
                    tempStudent = Student.students[j];
                    Student.students[j] = Student.students[j + 1];
                    Student.students[j + 1] = tempStudent;
                } else if (Student.students[j + 1].getAverage() == Student.students[j].getAverage() && Student.students[j + 1].getSurname().compareTo(Student.students[j].getSurname()) < 0) {
                    tempStudent = Student.students[j];
                    Student.students[j] = Student.students[j + 1];
                    Student.students[j + 1] = tempStudent;
                } else if (Student.students[j + 1].getSurname().equals(Student.students[j].getSurname()) && Student.students[j + 1].getName().compareTo(Student.students[j].getName()) < 0) {
                    tempStudent = Student.students[j];
                    Student.students[j] = Student.students[j + 1];
                    Student.students[j + 1] = tempStudent;
                }
            }
        }
    }


}
