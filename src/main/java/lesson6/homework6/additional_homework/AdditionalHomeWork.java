package lesson6.homework6.additional_homework;

import utils.MathOperationUtils;

import java.util.Random;

public class AdditionalHomeWork {

    public static void main(String[] args) {
        int firstNumber = MathOperationUtils.generateRandomNumber(1, 100);
        String operator = MathOperationUtils.getRandomMathOperator();
        int secondNumber = MathOperationUtils.generateRandomNumber(100, 200);
        System.out.println("Sum is: " + MathOperationUtils.calculate(firstNumber, operator, secondNumber));
    }

}
