package lesson3.homework3;

import javax.management.StandardEmitterMBean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {
        String input = "abccba";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);
        StringBuilder builder = new StringBuilder();

        while (matcher.find()){
            builder.append(matcher.group());
        }

        String result = builder.toString();
        String reverseResult = builder.reverse().toString();

        if (reverseResult.compareTo(result) == 0){
            System.out.println("Polindrom");
        } else {
            System.out.println("Not polindrom");
        }

    }
}
