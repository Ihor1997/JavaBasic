package lesson1;

public class BoolLogic {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println("        a = " + a);
        System.out.println("        b = " + b);
        System.out.println("      a | b = " + c);
        System.out.println("      a & b = " + d);
        System.out.println("      a ^ b = " + e);
        System.out.println("!a & b | a & !b = " + f);
        System.out.println("       !a = " + g);


        int r = 10;
        int k = 2;

        if (k != 0 && r % k == 0) {
            System.out.println("true");

        }
    }

    public static boolean check(int a, int b){
        if (a != 0 && b % a == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
