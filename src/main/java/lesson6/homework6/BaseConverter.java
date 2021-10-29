package lesson6.homework6;

import java.text.DecimalFormat;

public class BaseConverter {

    public static String replaceUnitOfDegree(double c, String unitDegree) {
        DecimalFormat decimalFormat = new DecimalFormat("####.##");
        double result = 0.0;

        if (unitDegree.equalsIgnoreCase("k")) {
            result = c + 273.15;

            return decimalFormat.format(result);
        } else if (unitDegree.equalsIgnoreCase("f")) {
            result = c * 1.8 + 32;
            return decimalFormat.format(result);

        } else {
            throw new IllegalArgumentException("Supported converting only to F(Fahrenheit) and K(Kelvin).Your format is: " + unitDegree);
        }
    }


}
