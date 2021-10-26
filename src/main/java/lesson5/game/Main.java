package lesson5.game;

public class Main {

    public static void main(String[] args) {
        Soldier soldier = new Soldier("Soldier");
        Soldier soldier2 = new Sergeant("Sergeant");
        Soldier soldier3 = new General("General");

        soldier3.getHealth();
    }
}
