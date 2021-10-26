package lesson4;

public class ObjectClassWork {


    static int i1= intializa("i0");
    static int i2;
    static {
        i2 = intializa("i1");
    }
    static int i3= intializa("i2");

    static int i4;
    static {
        i4= intializa("i4");
    }

    static int intializa(String name){
        System.out.println(name);
        return 0;
    }



//    public static class C{
//        static int i = value();
//        static int value(){
//            System.out.println("C.i initailized");
//            return 1;
//        }
//    }


    public static void main(String[] args) throws ClassNotFoundException {
//        System.out.println("Before class loading");
//        Class.forName(ObjectClassWork.class.getName());
//        System.out.println("After class loading");
    }
}
