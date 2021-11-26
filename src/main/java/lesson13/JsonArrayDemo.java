package lesson13;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArrayDemo {

    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(Boolean.TRUE);
        jsonArray.put("Lorem");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "jon doe");
        jsonObject.put("age", "22");
        jsonObject.put("city", "chicago");
        System.out.println(jsonArray.put(jsonObject));
    }
}
