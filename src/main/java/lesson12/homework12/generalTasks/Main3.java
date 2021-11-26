package lesson12.homework12.generalTasks;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        Main3 main3 = new Main3();
        Product product = new Product("Ashan");
        Product product2 = new Product("Zara");
        Product product3 = new Product("ATB");
        HeavyBox firstBox = new HeavyBox("Heavy", 3);
        HeavyBox secondBox = new HeavyBox("Light", 2);
        HeavyBox thirdBox = new HeavyBox("more", 1);
        //10

        Collection<HeavyBox> collection = new ArrayList<>();
        collection.add(firstBox);
        collection.add(secondBox);
        collection.add(thirdBox);
        Collection<HeavyBox> sortedCollection = main3.weightChecker(collection);
        System.out.println(sortedCollection);

        //11
        HashMap<Product, String> hashMap = new HashMap<>();
        hashMap.put(product, "Car");
        hashMap.put(product2, "Missile");
        hashMap.put(product3, "Barby");
        main3.entrySetPrint(hashMap);
        main3.keySetPrint(hashMap);
        main3.valueOfMapPrint(hashMap);

        Set<Map.Entry<Product, String>> entries = hashMap.entrySet();
        for (Map.Entry<Product, String> entry : entries) {

        }
    }

    //10
    public Collection<HeavyBox> weightChecker(Collection<HeavyBox> arrayToCheck) {
        ArrayList<HeavyBox> definedWeightBoxes = new ArrayList<>();
        for (HeavyBox heavyBox : arrayToCheck) {
            if (heavyBox.weight > 1) {
                definedWeightBoxes.add(heavyBox);
            }
        }
        return definedWeightBoxes;
    }

    //11
    public void entrySetPrint(HashMap<?, ?> hashMapToPrint) {
        Set<? extends Map.Entry<?, ?>> entries = hashMapToPrint.entrySet();
        System.out.println("Entries of hashMap is: " + entries);
    }

    public void keySetPrint(HashMap<?, ?> hashMapToPrint) {
        Set<? extends Map.Entry<?, ?>> entries = hashMapToPrint.entrySet();
        for (Map.Entry<?, ?> entry : entries) {
            System.out.println("Keys: " + entry.getKey());

        }
    }

    public void valueOfMapPrint(HashMap<?, ?> hashMapToPrint) {
        Set<? extends Map.Entry<?, ?>> entries = hashMapToPrint.entrySet();
        for (Map.Entry<?, ?> entry : entries) {
            System.out.println("Value: " + entry.getValue());

        }
    }
}