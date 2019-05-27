package OOP3.Paskaita;

public class Person {
    String name;
    String surname;
    int age;

    /** Constructor of the class Person
     * @param name    The name of the person
     * @param surname The surname of the person
     * @param age     The age of the person
     */
    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Person() {
        this("Vardenis", "Pavardenis", 69);
    }


    String getFullName() {
        return this.name + " " + this.surname;
    }

    int getAge() {
        return this.age;
    }
}
