package lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Player> map = new HashMap<>();
        Player player = new Player("ss", 2,3,4);

        map.put("001", player);
        map.put("22", player);
        map.put("1213", player);


        Set<Map.Entry<String, Player>> entries = map.entrySet();
        for (Map.Entry<String, Player> entry : entries) {
            System.out.println("Phone: " + entry.getKey() + ":" + entry.getValue());
        }
    }

}
