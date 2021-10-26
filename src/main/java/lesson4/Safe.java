package lesson4;

public class Safe {

        double widht;
        double height;
        double depth;
        double safeVolume;

    public static void main(String[] args) {
        Safe safe = new Safe();
        Safe safe1 = new Safe();


        safe.setSafeVolume(22,33,44);
        safe1.setSafeVolume(23,44,11);
        printSafeVolume(safe,1);
        printSafeVolume(safe1,2);

    }

    void setSafeVolume(double pDepth, double pHeight, double pWidht){
        depth = pDepth;
        widht = pWidht;
        height = pHeight;
    }

    double getSafeVolume(){
        return  widht * height * depth;
    }

    static void printSafeVolume(Safe safe, int number){
        System.out.println("Volume " +number+"-n safe= " + safe.getSafeVolume());
    }
}
