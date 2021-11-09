package lesson8.inner;

public class Ship {

    private int id;
    public static class LifeBoat{
        private int boatId;
        public static void down(){
            System.out.println("Boat to water");
        }
        public void swim(){
            System.out.println("Boat moved");
        }
    }

}
