package lesson5.battle;

import lesson5.game.Army;
import lesson5.game.General;
import lesson5.game.Sergeant;
import lesson5.game.Soldier;

import java.util.Random;

public class Battle2 {

    Sergeant sergeant = new Sergeant("Sergeant");
    General general = new General("General");
    Soldier[] s = new Soldier[100];

    Army army =  new Army();

    public Battle2(){
        s[0] = new Soldier("Soldier");
        s[1] = new Soldier("Soldier");
        s[2] = new Soldier("Soldier");
        s[3] = new Soldier("Soldier");

        army.addSoldier(battle (sergeant, general));
        army.addSoldier(battle (s[0], s[1]));
        army.addSoldier(battle (s[2], s[3]));

        System.out.println("Sum army health: " + army.calcArmyHealth());

    }

    public Soldier battle(Soldier soldier1, Soldier soldier2){
        Random random = new Random();
        while (soldier1.isAlive() && soldier2.isAlive()){
            soldier1.hit(soldier2, random.nextInt(100));
            if (soldier2.isAlive()){
                soldier2.hit(soldier1, random.nextInt(100));
            }
        }

        if (!soldier1.isAlive()){
            System.out.println("***** End of battle. Won " + soldier2 + " *****");
            return soldier2;
        } else {
            System.out.println("***** End of battle. Won " + soldier1 + " *****");
            return soldier1;

        }
    }

    public static void main(String[] args) {
        new Battle2();
    }
}
