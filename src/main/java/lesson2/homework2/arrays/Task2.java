package lesson2.homework2.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] intsArray = new int[12];
        int max = 15;
        int min = -15;
        Random random = new Random();
        int lastIndexHolder = 0;


        for (int i = 0; i < intsArray.length; i++) {
            int boundHolder = random.nextInt(max - min) + min;
            intsArray[i] = boundHolder;
        }
        int arrayIndex = intsArray[0];

        for (int i = 0; i <intsArray.length ; i++) {
            if (intsArray[i] > arrayIndex){
                arrayIndex = intsArray[i];
                lastIndexHolder = i;
            }

        }

        System.out.println(Arrays.toString(intsArray));
        System.out.println(arrayIndex);
        System.out.println("Index of max number is: " +lastIndexHolder);

    }
}
