package OOP7.Uzduotis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Person {
    private Long citizenCode;
    private String name;
    private String surname;

    private static Map<Long, List<Person>> people = new TreeMap<>();

    public Person(Long citizenCode, String name, String surname) {
        this.citizenCode = citizenCode;
        this.name = name;
        this.surname = surname;
    }

    public Long getCitizenCode() {
        return citizenCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static Map<Long, List<Person>> getPeople() {
        return people;
    }

    public static void insertToPeopleMap(Person person) {
        if (Person.people.get(person.citizenCode) == null) {
            List<Person> personList = new ArrayList<>();
            personList.add(person);
            Person.people.put(person.citizenCode,personList);
        } else{
            Person.people.get(person.citizenCode).add(person);
        }
    }

    public static List<Person> getPerson(Long citizenCode) {
        return Person.people.get(citizenCode);
    }

}
