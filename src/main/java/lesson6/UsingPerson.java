package lesson6;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingPerson {

    UsingPerson(){
        Person[] people = new Person[3];
        people[2] = new Person("Taras", "Naluvko");
        people[1] = new Person("Stepan", "Bandera");
        people[0] = new Person("Roman", "Klochko");

        Arrays.sort(people);
        for (Person p: people
             ) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        new UsingPerson();
    }
}
