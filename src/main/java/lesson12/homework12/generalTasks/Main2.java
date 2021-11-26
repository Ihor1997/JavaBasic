package lesson12.homework12.generalTasks;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        HeavyBox firstBox = new HeavyBox("Heavy", 3);
        HeavyBox secondBox = new HeavyBox("Light", 2);
        HeavyBox thirdBox = new HeavyBox("more", 5);
        HeavyBox nextBox = new HeavyBox("more", 5);

        //7
        TreeSet<HeavyBox> boxTreeSet = new TreeSet<>();
        boxTreeSet.add(firstBox);
        boxTreeSet.add(secondBox);

        for (HeavyBox entry : boxTreeSet) {
            System.out.println("Box: " + entry);
        }

        //8
        Set<HeavyBox> set = new HashSet<>();
        set.add(firstBox);
        Set<HeavyBox> set2 = new HashSet<>();
        set2.add(secondBox);
        set2.add(thirdBox);
        set2.add(nextBox);
        Set<HeavyBox> unionHeavyBoxes = main2.union(set,set2);
        System.out.println(unionHeavyBoxes);
        Set<HeavyBox> intersectedHeavyBoxes = main2.intersect(set,set2);
        System.out.println(intersectedHeavyBoxes);

        //9

        ArrayDeque<HeavyBox> heavyBoxArrayDeque = new ArrayDeque<>();
        heavyBoxArrayDeque.offer(firstBox);
        heavyBoxArrayDeque.offer(secondBox);
        heavyBoxArrayDeque.offer(thirdBox);
        System.out.println("Deque: "+ heavyBoxArrayDeque);
        heavyBoxArrayDeque.poll();
        heavyBoxArrayDeque.poll();
        System.out.println("Deque after poll: "+ heavyBoxArrayDeque);



    }


    //8
    public Set<HeavyBox> union(Set<HeavyBox> set, Set<HeavyBox> set2){
        Iterator<HeavyBox> iterator = set2.iterator();
        while (iterator.hasNext()){
            HeavyBox nextSet2Element = iterator.next();
            if (!set.contains(nextSet2Element)){
                set.add(nextSet2Element);
            }
        }
        return set;
    }

    public Set<HeavyBox> intersect(Set<HeavyBox> set, Set<HeavyBox> set2){
        Iterator<HeavyBox> iterator = set2.iterator();
        while (iterator.hasNext()){
            HeavyBox nextSet2Element = iterator.next();
            if (set.contains(nextSet2Element)){
                set.add(nextSet2Element);
            }
        }
        return set;

    }
}
