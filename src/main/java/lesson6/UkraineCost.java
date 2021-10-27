package lesson6;

public class UkraineCost extends CarTransportationCost{
    @Override
    public double countLocaleCost() {
        double enLocaleCosts = 20.00;
        double price = super.countPrimeCost() + super.countTransportationCosts("Urkaine");
        return price;
    }
}
