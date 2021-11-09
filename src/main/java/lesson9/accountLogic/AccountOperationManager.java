package lesson9.accountLogic;

public interface AccountOperationManager {

    double depositInCash(int i, int i1);
    boolean withDraw(int i, int i1);
    boolean convert(double i);
    boolean transfer(int i, double i1);
}
