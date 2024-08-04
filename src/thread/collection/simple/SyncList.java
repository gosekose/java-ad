package thread.collection.simple;

import java.util.Arrays;

import static util.ThreadUtils.sleep;

public class SyncList implements SimpleList {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementDatas;
    private int size = 0;


    public SyncList() {
        elementDatas = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public synchronized int size() {
        return size;
    }

    @Override
    public synchronized void add(Object o) {
        elementDatas[size] = o;
        sleep(100);
        size++;
    }

    @Override
    public synchronized Object get(int index) {
        return elementDatas[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementDatas, size)) + " size = " + size + " capacity = " + elementDatas.length;
    }
}
