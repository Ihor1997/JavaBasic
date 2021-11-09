package lesson9.hm9;

public class Runnable {


    @Repeat(runCount = 5)
    public void run(){
        System.out.println("Hello");
    }

}
