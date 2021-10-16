package lesson2.homework2.order_managment;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int userInput = scanner.nextInt();
        int result=0;

        for (int i = 0; i <= userInput; i++) {
            result +=i;

        }

        System.out.println(result);
    }
}
