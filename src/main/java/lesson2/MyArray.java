package lesson2;

import java.util.Scanner;

public class MyArray {

    public static void main(String[] args) {
        int[] intArray = {1,5,2,4,6,7};
        for (int currentElement: intArray){
            System.out.println(currentElement);
        }

        Scanner in = new Scanner(System.in);
        int n =1;
        read_data:
        while (n <10){
            for (int a =1; a<3;a++){
                System.out.println("Enter your number: ");
                n = in.nextInt();
                if (n < 0){
                    break read_data;
                }
            }
            if (n < -10){
                System.out.println("after breack");
            } else {
                System.out.println("after in else");
            }
        }
    }
}
