package collect;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(2, "divya");
        lhm.put(1, null);
        lhm.put(5, null);
        lhm.put(4, "divya");
        lhm.put(0, "deepika");
        lhm.put(3, null);

        
        System.out.println(lhm.computeIfPresent(2, (key, value) -> null));

        
        System.out.println(lhm.containsValue(null));

        lhm.remove(5, null);

        for (Map.Entry<Integer, String> entry : lhm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

