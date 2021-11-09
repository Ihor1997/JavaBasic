package lesson8;

public class Program {

    public static void main(String[] args) {
        Printer printer = new Printer(2,2);
        String[] people = {"Tom", "Alice"};
        Integer[] numbers = {23,4};

        printer.print(people);
        printer.print(numbers);

    }
}
