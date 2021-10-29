package lesson6;

public class Main {
    public static void main(String[] args) {
        F1Car f1Car = new F1Car();
        Sedan sedan = new Sedan();
        Truck truck = new Truck();
        UnUsusalCar unUsusalCar = new UnUsusalCar();
        truck.gas();
        f1Car.gas();
        sedan.gas();
        unUsusalCar.gas();
    }
}
