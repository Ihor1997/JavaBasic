package lesson9.accountLogic;

import lesson9.annotation.SecurityLevelEnum;

import java.lang.reflect.Method;

public class SecurityLogic {

    public void onInvoke(SecurityLevelEnum levelEnum, Method method, Object[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object arg : args) {
            stringBuilder.append(arg.toString() + " :");
        }

        stringBuilder.setLength(stringBuilder.length() - 1);

        System.out.println(String.format("Method %S was invoked with parameters : %s", method.getName(), stringBuilder.toString()));


        switch (levelEnum) {
            case LOW:
                System.out.println("Low level: " + levelEnum);
                break;

            case NORMAL:
                System.out.println("Normal level: " + levelEnum);
                break;
            case HIGHT:
                System.out.println("Hight level: " + levelEnum);
                break;
        }
    }
}
