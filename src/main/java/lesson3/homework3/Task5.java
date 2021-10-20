package lesson3.homework3;

import java.util.ArrayList;

public class Task5 {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("rabbit");
        arrayList.add("bribe");
        arrayList.add("dog");
        Task5.checkCharsPresent("rabbit", "bib");


    }

    static void checkCharsPresent(String givenString, String stringToFind){

        char[] result = givenString.toCharArray();
        int count = 0;

        for (int i = 0; i < givenString.length();i++) {
            for (int j = 0; j < stringToFind.length(); j++) {
                if (result[i] == givenString.charAt(j)){
                    count++;
                }
                else {

                }
            }
        }
        System.out.println(count);
    }

}
