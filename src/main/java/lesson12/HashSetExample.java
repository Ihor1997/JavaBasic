package lesson12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {


    public static void main(String[] args) {
        Set<String> set = new HashSet<>(10, (float) 0.8);
        set.add("One");
        set.add("Two");
        set.add("One");
        set.add("Two");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
