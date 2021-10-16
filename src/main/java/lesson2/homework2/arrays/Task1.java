package lesson2.homework2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        int[] arrayInt = new int[10];
        int undefiend;
        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {
            undefiend = random.nextInt(10);
            arrayInt[i] = undefiend;
        }
        System.out.println(Arrays.toString(arrayInt));

        for (int i = 0; i <arrayInt.length ; i++) {
            if (i % 2 == 0){
                arrayInt[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayInt));



    }
}
