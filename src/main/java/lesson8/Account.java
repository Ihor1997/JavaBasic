package lesson8;

public class Account {

    private String id;
    private int sum;

    public <T>Account(T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }


    public static void main(String[] args) {
        Account account = new Account("ciid", 5000);
        Account account1 = new Account(2222, 444);
        System.out.println(account.getId());
        System.out.println(account1.getId());
    }
}
