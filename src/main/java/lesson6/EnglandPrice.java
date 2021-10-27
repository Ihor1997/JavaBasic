package lesson6;

public class EnglandPrice extends CarTransportationCost{

    @Override
    public double countLocaleCost() {
        double enLocaleCosts = 15.99;
        double price = super.countPrimeCost() + super.countTransportationCosts("England");
        return price;
    }
}
