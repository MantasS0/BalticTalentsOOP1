package OOP7.Uzduotis;

/*Sukurkite žodyno tipo kolekciją saugoti žmonių klasės objektus
(su tokiais laukais: vardas, pavardė, asmens kodas), o kaip
raktą naudokite asmens kodą.
Įdėkite keletą žmonių į kolekciją ir atspausdinkite žmones
asmens kodo didėjimo tvarka.
Pabandykite įdėti į kolekciją du skirtingus žmones bet su tuo
pačiu asmens kodu. Patikrinkite kas atsitiks?
Pagalvokite kaip saugoti žmones jei norime turėti kelis su tuo
pačiu asmens kodu.*/

import java.util.*;

public class Uzduotis {
    public static void main(String[] args) {
/*
        Person person1 = new Person(39105153322l,"Romas","Garkas");
        Person person2 = new Person(38512013245l,"Arnas","Lionginas");
        Person person3 = new Person(48603142299l,"Maryte","Melninkaite");
        Person person4 = new Person(49009103377l,"Dalia","Morka");
*/
        Person.insertToPeopleMap(new Person(39105153322l,"Romas","Garkas"));
        Person.insertToPeopleMap(new Person(38512013245l,"Arnas","Lionginas"));
        Person.insertToPeopleMap(new Person(48603142299l,"Maryte","Melninkaite"));
        Person.insertToPeopleMap(new Person(49009103377l,"Dalia","Morka"));
        Person.insertToPeopleMap(new Person(49009103377l,"Milda","Morkiene"));


       for (Map.Entry<Long, List<Person>> personEntry : Person.getPeople().entrySet()){
           for (Person person : personEntry.getValue()){
               System.out.println("A.K.: " + person.getCitizenCode() + " Vardas: " + person.getName() + " Pavarde: " + person.getSurname());
           }
       }
    }
}
