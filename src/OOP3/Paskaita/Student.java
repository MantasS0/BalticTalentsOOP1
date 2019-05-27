package OOP3.Paskaita;

public class Student extends Person {

    String studentClass;


    public Student(String name, String surname, String studentClass) {
        super(name, surname);
        this.studentClass = studentClass;
    }
}
