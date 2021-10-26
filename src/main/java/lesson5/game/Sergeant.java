package lesson5.game;

public class Sergeant extends Soldier {
    public Sergeant(String rank) {
        super(rank);
        super.health = super.health*10;
    }
}
