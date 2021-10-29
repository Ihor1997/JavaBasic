package lesson6;

public class Person implements Comparable<Person>{

    private String firstName;
    private String surName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return getSurName().compareToIgnoreCase(o.getSurName());
    }
}
