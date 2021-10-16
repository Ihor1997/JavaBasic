package lesson2.homework2.arrays;

import java.util.Arrays;
import java.util.Collections;

public class Task4 {

    public static void main(String[] args) {
        //First solution
        String[] array = {"5","4","3", "2","1","0"};
        Task4.sortStringArray(array);
        System.out.println(Arrays.toString(array));

        //second solution

        String[] array2 = {"5","4","3", "2","1","0"};

        int lenght = array2.length;
        String temp;

        for (int i = 0; i < lenght/2; i++) {
            temp = array2[lenght -i-1];
            array2[lenght-i-1] = array2[i];
            array2[i] =temp;

        }

        System.out.println(Arrays.toString(array2));

    }
    public static void sortStringArray(String[] arrayToSort){
        Arrays.sort(arrayToSort);
    }

}
