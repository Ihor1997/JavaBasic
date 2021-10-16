package lesson2;

import java.util.Random;
import java.util.Scanner;

public class ClassWork1 {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        String userAnswer = "Y";
        Random random = new Random();
        int randomInt = random.nextInt(10);
        System.out.println(randomInt);

        while (userAnswer.equals("Y") || userAnswer.equals("y")){
            System.out.println("Enter your value....");
            int userNumber =0;
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
            }
            if (userNumber == randomInt){
                System.out.println("You are win!!");
                break;

            } else {
                System.out.println("YOu are lose");
                //userAnswer = scanner.next();
            }



        }


    }
}
