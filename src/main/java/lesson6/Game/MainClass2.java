package lesson6.Game;

import lesson6.CarCost;
import lesson6.EnglandPrice;
import lesson6.MainClass;
import lesson6.UkraineCost;

import java.util.Scanner;

public class MainClass2 {

    Scanner in;
    CarCost cc;

    MainClass2() {
        in = new Scanner(System.in);
        System.out.println("Enter Country Name: ");
        String str = in.nextLine();


        if (str.equalsIgnoreCase("Ukraine") || str.equalsIgnoreCase("Україна")) {
            cc = new UkraineCost();
        } else if (str.equalsIgnoreCase("England") || str.equalsIgnoreCase("Англія")) {
            cc = new EnglandPrice();
        } else {
            System.out.println("Nothing found!");
            return;
        }
        System.out.println("Price of car (" + str + "): " +cc.countLocaleCost());
    }

    public static void main(String[] args) {
        new MainClass2();
    }
}
