package lesson13;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonObjectsDemo {


    public static void main(String[] args) {
//        JSONObject jo = new JSONObject();
//        jo.put("name", "jon doe");
//        jo.put("age", 22);
//        jo.put("city", "chicago");
//        System.out.println(jo);

//        Map<String, String> map = new HashMap<>();
//        map.put("name", "jon doe");
//        map.put("age", "22");
//        map.put("city", "chicago");
//
//        JSONObject jsonObject = new JSONObject(map);
//        System.out.println(jsonObject);
//
//        JSONObject object = new JSONObject(
//                "{\"city\":\"jon doe\"}"
//        );
//        System.out.println(object);

        DemoBean demoBean = new DemoBean();
        demoBean.setId(1);
        demoBean.setName("Lorem");
        demoBean.setActive(true);

        JSONObject jsonObject1 = new JSONObject(demoBean);
        System.out.println(jsonObject1);



    }

}
