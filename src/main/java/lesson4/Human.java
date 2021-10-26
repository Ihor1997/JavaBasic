package lesson4;

public class Human implements Swim{

    private int age;
    private String name;

    public Human(String name, int age){
        this.age = age;
        this.name = name;
    }










    @Override
    public String toString(){
        return "I " + name+", am " +age+" old .";
    }

    @Override
    public void swim() {
        System.out.println(this+ "I smeem with circle");
    }
}
