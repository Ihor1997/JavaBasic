package lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClassWork {

    public static void main(String[] args) {
        String text = "FIFA will! never regret";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for (String word: words
            ) {
            System.out.println(word);

        }

        String input = "Java SE 8. JavaScript";

//        boolean result = input.matches("(\\+{1}\\d{12})");
//        if (result){
//            System.out.println("Phone number");
//        } else {
//            System.out.println("Not phone number");
//        }
//
//        boolean found = Pattern.matches("380930633176", input);
//        if (found){
//            System.out.println("Found");
//        } else {
//            System.out.println("Not found");
//        }

        Pattern pattern = Pattern.compile("Java(\\w*)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
