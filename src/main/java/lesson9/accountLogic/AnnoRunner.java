package lesson9.accountLogic;

public class AnnoRunner {

    public static void main(String[] args) {


        AccountOperationManager accountOperationManager = new AccountOperationManagerImpl();

        AccountOperationManager securityAccount = SecurityFactory.createSecurityObject(accountOperationManager);
        securityAccount.depositInCash(11000, 3);
        securityAccount.withDraw(11000, 3);
        securityAccount.convert(200);
        securityAccount.transfer(11000, 30);

    }
}