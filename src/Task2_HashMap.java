import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task2_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Books", 12);
        map.put("Movies", 8);
        map.put("Games", 15);
        map.put("Music", 10);
        map.put("Sports", 5);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        System.out.println("Original HashMap:");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if ("Movies".equals(entry.getKey())) {
                entry.setValue(entry.getValue() + 2);
            }
            if ("Games".equals(entry.getKey())) {
                iterator.remove();
            }
        }

        System.out.println("Updated HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
