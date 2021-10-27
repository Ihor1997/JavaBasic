package lesson6;

public class MainClass {

    UkraineCost ukraineCost = null;
    EnglandPrice englandPrice = null;


    MainClass(){
        ukraineCost = new UkraineCost();
        englandPrice = new EnglandPrice();
        System.out.println("Ukraine Price: " +ukraineCost.countLocaleCost());
        System.out.println("Endgland Price: " +englandPrice.countLocaleCost());

    }

    public static void main(String[] args) {
         new MainClass();
    }
}
