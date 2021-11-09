package lesson8.enums;

import java.util.Locale;

public class TaxiRunner {

    public static void main(String[] args) {
        TaxiStation taxiStation = TaxiStation.valueOf(TaxiStation.class, "Volvo".toUpperCase(Locale.ROOT));
        TaxiStation taxiStation1 = TaxiStation.MERSEDES;


        System.out.println(taxiStation + " : ordinal -> " + taxiStation.ordinal());
        taxiStation.setFreeCars(3);

        TaxiStation[] stations = TaxiStation.values();
        for (TaxiStation station: stations){
            System.out.println(station);
        }
    }
}
