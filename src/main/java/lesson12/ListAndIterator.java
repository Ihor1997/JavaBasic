package lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListAndIterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        ListIterator<String> listIterator = list.listIterator();
        String first = listIterator.next();
        System.out.println("First " +first);

        String second = listIterator.next();
        System.out.println("Second " +second);

        if (listIterator.hasPrevious()){
            String value = listIterator.previous();
            System.out.println("value " + value);
        }
        System.out.println("-----");

        while (listIterator.hasNext()){
            String value = listIterator.next();
            System.out.println("value " + value);
        }
    }

}
