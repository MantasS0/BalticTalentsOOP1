package OOP3.Uzdavinys1;

public class Student extends Person{

    String className;

    public Student(String name, String surname, String className) {
        super(name, surname);
        this.className = className;
    }
}
