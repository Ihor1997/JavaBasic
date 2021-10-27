package lesson6;

public class Utils {

    private Utils(){
        throw  new AssertionError();
    }


    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println(utils.toString());
    }
}
