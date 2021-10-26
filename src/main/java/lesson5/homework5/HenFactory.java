package lesson5.homework5;

public class HenFactory {


    public Hen getHens(String countryName) {
        Hen hen = null;

        if (countryName.equalsIgnoreCase("Ukraine")) {
            hen = new UkrainianHen();
        } else if (countryName.equalsIgnoreCase("Moldova")) {
            hen = new MoldovanHen();

        } else if (countryName.equalsIgnoreCase("Belarus")) {
            hen = new BelarusianHen();

        } else if (countryName.equalsIgnoreCase("Polish")) {
            hen = new PolishHen();

        }
        return hen;


    }
}
