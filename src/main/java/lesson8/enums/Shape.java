package lesson8.enums;

import lesson7.Main;

public enum Shape {
    RECTANGLE, TRIANGLE, CIRCLE;

    public double defineShape(double ...x){
        switch (this){
            case RECTANGLE:
                return x[0] * x[1];


            case TRIANGLE:
                return x[0] * x[1] / 2;

            case CIRCLE:
                return Math.pow(x[0], 2) * Math.PI;

            default:
                throw new
                        EnumConstantNotPresentException(this.getClass(), "constans not found ");
        }
    }
}
