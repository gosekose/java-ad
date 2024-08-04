package thread.collection.java;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new CopyOnWriteArraySet<>();

        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");

        Set<String> skipListSet = new ConcurrentSkipListSet<>();
        skipListSet.add("1");
        skipListSet.add("2");
        skipListSet.add("3");
        skipListSet.add("3");

        System.out.println("set = " + set);
        System.out.println("skipListSet = " + skipListSet);
    }
}
