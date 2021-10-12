package utils;

import java.util.Arrays;
import java.util.Collections;

public class MathOperationUtils {

    public static void checkEvenNumber(int numberToCheck) {
        String operationResult = (numberToCheck % 2 == 0) ? "Number is even" : "Number is not even";
        System.out.println(operationResult);
    }

    public static void sortNumbersInArray(Integer[] arrayToSort, boolean sortByASC){
        if (sortByASC) {
            Arrays.sort(arrayToSort);
            System.out.println("Sorted array by ASC: " + Arrays.toString(arrayToSort));
        } else {
            Arrays.sort(arrayToSort, Collections.reverseOrder());
            System.out.println("Sorted array by DESC: " + Arrays.toString(arrayToSort));
        }
    }
}
