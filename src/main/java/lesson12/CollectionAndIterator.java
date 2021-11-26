package lesson12;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class CollectionAndIterator {
    public static void main(String[] args) {
        Collection<String> collection = new Vector<>();
        collection.add("Collection");
        collection.add("Queue");
        collection.add("List");

        System.out.println("Size: "+collection.size());
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println("element: " +s);
        }

    }
}
