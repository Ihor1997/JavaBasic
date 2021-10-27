package lesson6;

public abstract class CarCost {

    public double countPrimeCost(){
        return 50000.0;
    }

    public abstract double countTransportationCosts(String County);

    public abstract double countLocaleCost();
}
