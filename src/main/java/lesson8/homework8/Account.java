package lesson8.homework8;

public class Account {

    private int accountBalance = 10000;


    public Account() {

    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getACCOUNT_BALANCE() {
        return accountBalance;
    }

    static class AccountOperations{
        Account account;

        public AccountOperations() {
           account = new Account();

        }

        public void removal(int countForRemoval){
            System.out.println("Removal operaion size: "+countForRemoval+" ,Balance Before Removal: "+ getAccountBalance());
            account.setAccountBalance(getAccountBalance() - countForRemoval);
            System.out.println("Balance After Removal: "+ getAccountBalance());

        }

        public void sendPayment(int countToSend){
            System.out.println("Sending payment size: " + countToSend+" ,Before Removal: "+ getAccountBalance());
            account.setAccountBalance(getAccountBalance() - countToSend);
            System.out.println("Balance After Removal: "+ getAccountBalance());
        }

        public void enrollment(int countForEnrollment){
            System.out.println("Enroll  size: " + countForEnrollment+" ,Before Enrollment: "+ getAccountBalance());
            account.setAccountBalance(getAccountBalance() + countForEnrollment);
            System.out.println("Balance After Enrollment: "+ getAccountBalance());
        }

        public int getAccountBalance(){
            return account.getAccountBalance();
        }
    }


    public static void main(String[] args) {
        AccountOperations account = new AccountOperations();
        account.removal(222);
        account.sendPayment(222);
        account.enrollment(444);
        System.out.println(account.getAccountBalance());
    }

}
