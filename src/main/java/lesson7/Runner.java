package lesson7;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.set_maker("Aidu");
        car1.set_price(1000);
        car1.set_year("200");
        car1.set_color("red");

        Car car2 = new Car("BMW", 2000, "2000", "black");

        System.out.println(car1);
        System.out.println(car2);
    }
}
