package lesson5.homework5;

public class HenFactory {


    public void getHens(String countryName) {

        if (countryName.equalsIgnoreCase("Ukraine")) {
            new UkrainianHen();
        } else if (countryName.equalsIgnoreCase("Moldova")) {
            new MoldovanHen();

        } else if (countryName.equalsIgnoreCase("Belarus")) {
            new BelarusianHen();

        } else if (countryName.equalsIgnoreCase("Polish")) {
            new PolishHen();

        }


    }
}
