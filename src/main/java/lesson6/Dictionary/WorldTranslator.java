package lesson6.Dictionary;

import java.util.Dictionary;
import java.util.Scanner;

public class WorldTranslator{

    Dict dict;

    WorldTranslator(Dict dict){
        Scanner in = new Scanner(System.in);
        String word;
        do {
            System.out.println("Enter word(ext- exit)");
            word = in.next();
            System.out.println(" - " + dict.findTranslation(word));
        } while (!word.equalsIgnoreCase("ext"));
    }

    public String getTranslation(String word){
        return null;
    }
}
