package lesson12;

import java.util.LinkedList;

public class HellpLinkedList {


    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("f");
        linkedList.add("b");
        linkedList.addLast("z");
        linkedList.addFirst("a");
        linkedList.add(1,"a2");
        System.out.println("Original :" +linkedList);
        linkedList.remove("f");
        linkedList.remove(2);
        System.out.println("After deletion: "+linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("First last changes: " + linkedList);
        Object val = linkedList.get(0);
        linkedList.set(0, val +"changed");
        System.out.println("Last "+ linkedList);
    }
}
