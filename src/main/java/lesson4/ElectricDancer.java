package lesson4;

public class ElectricDancer extends Dancer{
    public ElectricDancer(String name, int age){
        super(name,age);
    }

    @Override
    public void dance() {
        System.out.println(toString() + "I dance like electric");
    }


}
