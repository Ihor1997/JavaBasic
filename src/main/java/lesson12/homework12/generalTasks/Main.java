package lesson12.homework12.generalTasks;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 1
        List<HeavyBox> heavyBoxes = new ArrayList<>();
        HeavyBox firstBox = new HeavyBox("Heavy", 3);
        HeavyBox secondBox = new HeavyBox("Light", 2);
        HeavyBox thirdBox = new HeavyBox("Small", 2);
        heavyBoxes.add(firstBox);
        heavyBoxes.add(secondBox);
        heavyBoxes.add(thirdBox);

        // 2
        for (HeavyBox entry : heavyBoxes) {
            System.out.println("Box: " + entry);
        }
        //3
        heavyBoxes.get(0).weight = 5;
        heavyBoxes.get(1).weight = 7;
        System.out.println("Boxes: " + heavyBoxes);

        //4
         int lastBoxIndex = heavyBoxes.lastIndexOf(secondBox);
         heavyBoxes.remove(lastBoxIndex);
            System.out.println("Boxes: " + heavyBoxes);

        //5
        System.out.println(heavyBoxes.get(0));
        System.out.println(heavyBoxes.get(lastBoxIndex));

        for (HeavyBox box : heavyBoxes) {
            if (box.boxName.equalsIgnoreCase("Small")) {
                System.out.println("Box found: " + box);
            }
        }

        //6
        heavyBoxes.clear();
        System.out.println(heavyBoxes);

    }
}