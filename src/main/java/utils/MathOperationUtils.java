package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MathOperationUtils {
    static Random random = new Random();

    public static void checkEvenNumber(int numberToCheck) {
        String operationResult = (numberToCheck % 2 == 0) ? "Number is even" : "Number is not even";
        System.out.println(operationResult);
    }

    public static void sortNumbersInArray(Integer[] arrayToSort, boolean sortByASC) {
        if (sortByASC) {
            Arrays.sort(arrayToSort);
            System.out.println("Sorted array by ASC: " + Arrays.toString(arrayToSort));
        } else {
            Arrays.sort(arrayToSort, Collections.reverseOrder());
            System.out.println("Sorted array by DESC: " + Arrays.toString(arrayToSort));
        }
    }


    public static int generateRandomNumber(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static String getRandomMathOperator() {
        int randomNumber = random.nextInt(4);
        switch (randomNumber) {
            case 0:
                return "+";

            case 1:
                return "-";

            case 2:
                return "*";

            case 3:
                return "/";

            default:
                return "";
        }

    }

    public static int calculate(int firstNumber, String operation, int secondNumber) {

        switch (operation) {
            case "+":
                System.out.println(firstNumber + " " + operation + " " + secondNumber);

                return firstNumber + secondNumber;

            case "-":
                System.out.println(firstNumber + " " + operation + " " + secondNumber);

                return firstNumber - secondNumber;

            case "*":
                System.out.println(firstNumber + " " + operation + " " + secondNumber);

                return firstNumber * secondNumber;

            case "/":
                System.out.println(firstNumber + " " + operation + " " + secondNumber);

                return firstNumber / secondNumber;

            default:
                return 1;
        }
    }
}
