import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new java.util.HashMap<>();
        map.put(1, "Johan");
        map.put(2, "Miracle");
        map.put(3, "Ganzzz");
        System.out.println("Map: " + map);
        System.out.println("Size: " + map.size());
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}