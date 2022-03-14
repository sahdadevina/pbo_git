package pbo_sahda;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer, String> arr = new HashMap<Integer, String>();
        
        // tambahkan element
        arr.put(1, "Annisa");
        arr.put(2, "Sahda");
        arr.put(3, "Devina");
        
        for (Map.Entry<Integer, String> entry : arr.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
