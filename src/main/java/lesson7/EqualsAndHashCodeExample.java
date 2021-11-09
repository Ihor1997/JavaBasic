package lesson7;

import java.util.Objects;

public class EqualsAndHashCodeExample {

    public static void main(String[] args) {

        System.out.println(new Simphson("Homer" , 35,120)
                .equals(new Simphson("Homer", 35,120)));

        System.out.println(new Simphson("Bart" , 10,120)
                .equals(new Simphson("El Barto", 10,45)));

        System.out.println(new Simphson("Lisa" , 35,120)
                .equals(new Object()));



    }

    static class Simphson{

        private String name;
        private int age;
        private int wight;

        public Simphson(String name, int age, int wight) {
            this.name = name;
            this.age = age;
            this.wight = wight;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null|| getClass() != o.getClass()) return false;
            Simphson simphson = (Simphson) o;
            return age == simphson.age && wight == simphson.wight && Objects.equals(name, simphson.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, wight);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWight() {
            return wight;
        }

        public void setWight(int wight) {
            this.wight = wight;
        }
    }
}
