package OOP4.Uzduotis1;

public class Student extends Person {

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
}
