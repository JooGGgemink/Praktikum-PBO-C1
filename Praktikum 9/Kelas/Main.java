import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> L;
        Set<Integer> i;
        L = new HashMap<>();
        L.put(1, "Joo");
        L.put(48, "Simanjuntak");
        L.put(38, "Tampan");
        System.out.println("banyak elemen: " + L.size());
        
        i = L.keySet();

        for (Integer x : i) {
            System.out.println("key: " + x + " value: " + L.get(x));    
        }
    }
}
    