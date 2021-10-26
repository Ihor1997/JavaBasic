package lesson4;

import java.util.SortedMap;

public class ObjectFieldInitialization {

    static class A {
        int i1 = intializa("i0");
        int i2;

        {
            i2 = intializa("i1");
        }

        int i3 = intializa("i2");

        int i4;

      A()  {
            i4 = intializa("i4");
        }

        static int intializa(String name) {
            System.out.println(name);
            return 0;
        }
    }

    static class B extends A{

        int i5 = intializa("i0");
        int i6;

        {
            i6 = intializa("i1");
        }

        int i7 = intializa("i2");


        B()  {
            i7 = intializa("i4");
        }

    }

    public static void main(String[] args) {
        System.out.println("start in main");
        new B();
    }
}