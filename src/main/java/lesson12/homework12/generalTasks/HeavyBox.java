package lesson12.homework12.generalTasks;

public class HeavyBox implements Comparable<HeavyBox> {


    public String boxName;
    public int weight;

    public HeavyBox(String boxName, int weight) {
        this.boxName = boxName;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "boxName='" + boxName + '\'' +
                ", countOfBoxes=" + weight +
                '}';
    }

    @Override
    public int compareTo(HeavyBox o) {
        if (o.equals(this)){
            return 1;
        }
        return 1;
    }
}
