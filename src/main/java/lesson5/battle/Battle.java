package lesson5.battle;

import lesson5.game.General;
import lesson5.game.Sergeant;
import lesson5.game.Soldier;

import java.util.Random;

public class Battle {

    Soldier soldier = new Sergeant("Soldier");
    Soldier soldier2 = new General("Soldier");

    public Battle() {
        battle(soldier,soldier2);
    }

    public void battle(Soldier soldier1, Soldier soldier2){
        Random random = new Random();
        while (soldier1.isAlive() && soldier2.isAlive()){
            soldier1.hit(soldier2, random.nextInt(100));
            if (soldier2.isAlive()){
                soldier2.hit(soldier1, random.nextInt(100));
            }
        }

        if (!soldier1.isAlive()){
            System.out.println("***** End of battle. Won " + soldier2 + " *****");
        } else {
            System.out.println("***** End of battle. Won " + soldier1 + " *****");

        }
    }

    public static void main(String[] args) {
        new Battle();
    }
}
