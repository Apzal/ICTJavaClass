package CT_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMaps {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("india",7);
        map.put("china",13);
        map.put("nepal",10);
        map.put("africa",56);
        map.put("us",100);
        map.put("india",200);

        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println("Key: " + key + " value: " + map.get(key));
        }
    }
}
