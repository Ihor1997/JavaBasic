package lesson12;

public class Player implements Comparable<Player>{

    private String name;
    private int goldMedal;
    private int silverMedal;
    private int bronzeMedal;


    public Player(String name, int goldMedal, int silverMedal, int bronzeMedal) {
        this.name = name;
        this.goldMedal = goldMedal;
        this.silverMedal = silverMedal;
        this.bronzeMedal = bronzeMedal;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", goldMedal=" + goldMedal +
                ", silverMedal='" + silverMedal + '\'' +
                ", bronzeMedal='" + bronzeMedal + '\'' +
                '}';
    }

    @Override
    public int compareTo(Player o) {
        int value = this.goldMedal-o.goldMedal;
        if (value != 0){
            return value;
        }

        value = this.bronzeMedal - o.bronzeMedal;
        if (value != 0){
            return value;
        }

        value = this.silverMedal - o.silverMedal;
            return value;


    }
}
