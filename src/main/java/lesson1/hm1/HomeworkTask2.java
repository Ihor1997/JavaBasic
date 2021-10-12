package lesson1.hm1;

import utils.MathOperationUtils;

import java.util.Arrays;

public class HomeworkTask2 {

    public static void main(String[] args) {
        //first solution
        int a =5,b=4,c=7;
        Integer[] intArray = {a,b,c};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        //second solution

        if (a<b & b<c) System.out.println(a + " " + b + " " + c);
        if (a<c & c<b) System.out.println(a + " " + c + " " + b);
        if (b<a & a<c) System.out.println(b + " " + a + " " + c);
        if (b<c & c<a) System.out.println(b + " " + c + " " + a);
        if (c<a & a<b) System.out.println(c + " " + a + " " + b);
        if (c<b & b<a) System.out.println(c + " " + b + " " + a);

    }
}
