package lesson8.classes;

public class Main {

    public static void main(String[] args) {
        Abonent abonent = new Abonent(6666666, "Sergey Lox");
        abonent.setTariffPlan("Loxovskoy");
        abonent.obtainPhoneNumber(66666,66);

        System.out.println(abonent);
    }
}
