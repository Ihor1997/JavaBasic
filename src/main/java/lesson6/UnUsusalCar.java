package lesson6;

public class UnUsusalCar implements Car{
    @Override
    public void gas() {
        System.out.println("This car gaz different");
    }

    @Override
    public void brake() {
    }

}
