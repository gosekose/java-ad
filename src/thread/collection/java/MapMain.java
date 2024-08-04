package thread.collection.java;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new ConcurrentHashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.putIfAbsent(4, "D");

        System.out.println("map1 = " + map1);

        Map<Integer, String> map2 = new ConcurrentSkipListMap<>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");
        map2.putIfAbsent(4, "D");

        System.out.println("map2 = " + map2);
    }
}
