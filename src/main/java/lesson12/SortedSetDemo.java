package lesson12;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Player> players = new TreeSet<>();
        Player tom = new Player("Tom", 1,2,3);
        Player jerry = new Player("Jerry", 3,4,5);
        Player donald = new Player("Donal", 2,5,3);

        players.add(tom);
        players.add(jerry);
        players.add(donald);

        for (Player player: players){
            System.out.println("Player: " + player);
        }
    }
}
