package lesson2.homework2.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        Random random = new Random();
        int max = 5;
        int min = 0;
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        float temp1 = 0;
        float temp2 = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(max - min) + min;
            array2[i] = random.nextInt(max - min) + min;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (int k : array1) {
            temp1 += k;
        }
        for (int i : array2) {
            temp2 += i;
        }

        temp1 = temp1 / array1.length;
        temp2 = temp2 / array2.length;
        if (temp1 > temp2){
            System.out.println("Array1 sum: "+temp1+" is bigger than Array2 sum: "+temp2);
        } else if (temp2 > temp1){
            System.out.println("Array2 sum: "+temp2+" is bigger than Array1 sum: "+temp1);
        } else if (temp1 == temp2){
            System.out.println("Array1 sum: "+temp1+" is equals Array2 sum: "+temp2);
        }

    }
}
