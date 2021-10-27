package lesson5.homework5;

import java.util.Random;

public abstract class Hen {

    protected int eggsCount;
    Random random = new Random();


    public abstract int getCountOfEggsPerMonth();


    public String getDescription(String countryName, int eggsCount){
        return "Hen Description: " + "My country is " + countryName + ", I produce " + eggsCount + " eggs per month.";
    };

}
