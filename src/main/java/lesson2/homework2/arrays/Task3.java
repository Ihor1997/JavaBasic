package lesson2.homework2.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        int[] intsArray = new int[4];
        int max = 99;
        int min = 10;
        Random random = new Random();


            for (int i = 0; i < intsArray.length; i++) {
                int boundHolder = random.nextInt(max - min) + min;
                intsArray[i] = boundHolder;
            }

            System.out.println(Arrays.toString(intsArray));


            for (int i = 0; i < intsArray.length; i++) {
                if (intsArray[i] <= intsArray[i + 1]) {
                    System.out.println("Sorted not by ASC: " + intsArray[i + 1] + " - " + intsArray[i]);
                    break;
                }
            }
    }
}