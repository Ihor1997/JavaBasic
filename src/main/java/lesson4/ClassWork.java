package lesson4;

public class ClassWork {

    public static void main(String[] args) {
        byte a = 15;
        byte b = a;
        System.out.println(b);


        int a1 = 0;
        long b1 = 15;
        a1 = (int) b1;
        System.out.println(a1);


        double a3  = 11.234;
        int b3 = (int) a3;
        System.out.println(b3);

        double a4 = 128;
        byte b4 = (byte) a4;
        System.out.println(b4);
    }
}
