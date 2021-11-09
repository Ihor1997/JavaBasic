package lesson7;

public class Program
{

    public static void main(String[] args) {
        Account account = new Account("123123", 123123);
        int accId = (int) account.getId();
        System.out.println(accId);

        Account account1 = new Account("12312", 123);
        System.out.println(account1.getId());
    }
}
