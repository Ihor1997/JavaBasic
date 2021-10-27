package lesson6;

public abstract class CarTransportationCost extends CarCost {


    @Override
    public double countTransportationCosts(String country){
        if (country.compareTo("Urkaine") == 0){
            return 3.000;
        }
        if (country.compareTo("England") == 0){
            return 2.000;
        }
        return -1.0;
    }
}
