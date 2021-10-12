package lesson1;

public class BitLogic {

    public static void main(String[] args) {
        String[] binary ={
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "0101", "1110", "1111"
        };
        int a =3;
        int b = 6;
        int c = a|b;

        boolean a1 = false;
        boolean b1 = true;
        boolean c1 = false;

        System.out.println(a1 && b1);
        System.out.println(a1 & b1);


        System.out.println(" a = " +binary[a]);
        System.out.println(" b = " +binary[b]);
        System.out.println(" a|b = " +binary[c]);
    }
}
