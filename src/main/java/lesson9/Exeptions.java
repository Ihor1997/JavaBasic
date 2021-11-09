package lesson9;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Exeptions {

    public double parseFromFrance(String number) throws ParseException {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.FRANCE);
        try{
            double numbEr = numberFormat.parse(number).doubleValue();
            return numbEr;
        } catch (ParseException e){
            throw new ParseException(e.getMessage(),1);

        }
    }
}
