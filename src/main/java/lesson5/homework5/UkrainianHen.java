package lesson5.homework5;

import java.util.Random;

public class UkrainianHen extends Hen {
    private String countryName = "Ukraine";

    public UkrainianHen() {
        eggsCount = random.nextInt(500);
        System.out.println(getDescription());
    }


    @Override
    public int getCountOfEggsPerMonth() {
        return eggsCount;
    }

    public String getDescription() {
        return super.getDescription() + "My country is " + this.countryName + ", I produce " + this.eggsCount + " eggs per month.";
    }
}
