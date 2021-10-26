package lesson5.game;

import java.util.Random;

public class Soldier{

    protected String rank;
    protected int health;
    protected boolean alive = false;
    protected int defence =0;
    protected static int count = 0;
    private int id = 0;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }


    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Soldier.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Soldier(String rank){
        this.rank = rank;

        id = ++count;
        health = 100;
        alive = true;

        Random random = new Random();
        defence = random.nextInt(50);
        System.out.println(rank+" PN#" + id+ " is created: health="+ health + ", defence="+ defence);
    }

    public int getHealth(){
        return health;
    }

    private void receiveHit(int hit){
        if (isAlive()){
            int damage = hit - defence;
            if (damage > 0){
                health = health - damage;
            } else {
                return;
            }

            if (health <= 0){
                alive = false;
                System.out.println("[X] " + rank+ " PN$" + id + " recieve damage " + damage + " and die by herp");
            } else {
                System.out.println(rank + "PN$" + id + " recieve damage " + damage + " health capacity = " + health);
            }
        }
    }

    public void hit(Soldier targetSoldier, int hit){
        targetSoldier.receiveHit(hit);
    }

    @Override
    public String toString(){
        return rank+" PN#" + id + ": health=" + health + ", defence=" + defence;
    }
}
