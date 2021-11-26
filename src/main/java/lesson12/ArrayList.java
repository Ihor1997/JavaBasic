package lesson12;

public class ArrayList {

    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(340);
        list.add(null);

        System.out.println("Size: " +list.size());

        Integer i = list.get(1);
        System.out.println("Element index 1 =" +i);
        Integer newInt = 1000;
        Integer old = list.set(1, newInt);
        System.out.println("Old value: " + old);
        System.out.println("New value: " + list.get(1));
    }
}
