package lesson2.homework2.order_managment;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что это есть такое: синий, большой, с усами и полный зайцев?: ");

        String successKeyword = "Троллейбус", surrenderKeyword ="Сдаюсь";
        int attemptCount =3;
        while (successKeyword.equals("Троллейбус") && attemptCount > 0){
            if (scanner.hasNext(successKeyword)){
                System.out.println("Правильно!");
                break;
            } else if (scanner.hasNext(surrenderKeyword)){
                System.out.println("Правильный ответ: Троллейбус.");
                break;
            } else {
                System.out.println("Подумайте еще.");
                attemptCount--;
                scanner.next();
            }

        }
    }
}
