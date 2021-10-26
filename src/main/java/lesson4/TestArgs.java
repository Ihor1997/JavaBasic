package lesson4;

public class TestArgs {

    static double k[] = {5.1, 2.3, 1.1};

    public static double sum(double... nums){
        double sum = 0;
        System.out.println("Col args: " + nums.length);
        for (double n : nums){
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(k));
    }
}
