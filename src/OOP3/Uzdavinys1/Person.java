package OOP3.Uzdavinys1;

public class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName(){
        return this.name + " " + this.surname;
    }
}
