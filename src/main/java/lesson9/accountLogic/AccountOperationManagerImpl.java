package lesson9.accountLogic;

import lesson9.annotation.BankingAnnotation;
import lesson9.annotation.SecurityLevelEnum;

public class AccountOperationManagerImpl implements AccountOperationManager {

    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGHT)
    @Override
    public double depositInCash(int i, int i1) {
        return 0;
    }

    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGHT)
    @Override
    public boolean withDraw(int i, int i1) {
        return false;
    }

    @BankingAnnotation(securityLevel = SecurityLevelEnum.LOW)
    @Override
    public boolean convert(double i) {
        return false;
    }
    @BankingAnnotation
    @Override
    public boolean transfer(int i, double i1) {
        return false;
    }
}
