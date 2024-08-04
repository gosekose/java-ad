package thread.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListMain {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("data");
        list.add("data");
        list.add("data");
        list.add("data");
        list.add("data");
        System.out.println("list = " + list);
    }
}
