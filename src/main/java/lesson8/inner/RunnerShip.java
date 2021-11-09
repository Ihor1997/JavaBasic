package lesson8.inner;

public class RunnerShip {
    public static void main(String[] args) {
        Ship.LifeBoat.down();
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
        lifeBoat.swim();
    }
}
