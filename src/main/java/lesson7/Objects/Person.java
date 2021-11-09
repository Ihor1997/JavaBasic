package lesson7.Objects;

public class Person {

    private int age;
    private String name;
    private CloneTest.Car car;

    public Person(CloneTest.Car car, int age, String name) {
        this.car = car;
        this.age = age;
        this.name = name;
    }
   public Person(Person person){
        this(new CloneTest.Car(person.car.color), person.getAge(), person.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        CloneTest.Car car = new CloneTest.Car("Green");
        Person person = new Person(car,18, "Dana");
        Person clone = new Person(person);
        System.out.println(clone);
        System.out.println(person);

        clone.setName("New");
        clone.car.color = "red";

        System.out.println(clone);
        System.out.println(person);
    }
}
