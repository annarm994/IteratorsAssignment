import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task3_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();
        map.put("January", 30.0);
        map.put("February", 28.5);
        map.put("March", 35.0);
        map.put("April", 40.5);
        map.put("May", 50.0);
        map.put("June", 60.5);

        Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();

        double highestTemp = Double.MIN_VALUE;
        double lowestTemp = Double.MAX_VALUE;
        String highestMonth = "";
        String lowestMonth = "";

        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            if (entry.getValue() > highestTemp) {
                highestTemp = entry.getValue();
                highestMonth = entry.getKey();
            }
            if (entry.getValue() < lowestTemp) {
                lowestTemp = entry.getValue();
                lowestMonth = entry.getKey();
            }
        }

        System.out.println("Highest temperature: " + highestTemp + " in " + highestMonth);
        System.out.println("Lowest temperature: " + lowestTemp + " in " + lowestMonth);
    }
}
