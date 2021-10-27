package lesson5.homework5;

import java.util.Random;

public class PolishHen extends Hen {
    private String countryName = "Polish";


    public PolishHen() {
        eggsCount = random.nextInt(100);
        System.out.println(getDescription());
    }


    @Override
    public int getCountOfEggsPerMonth() {
        return eggsCount;
    }

    public String getDescription(){
        return super.getDescription(this.countryName, this.eggsCount);
    };
}
