package thread.collection.simple;

import util.ThreadUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static util.ThreadUtils.sleep;

public class BasicList implements SimpleList {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementDatas;
    private int size = 0;


    public BasicList() {
        elementDatas = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object o) {
        elementDatas[size] = o;
        sleep(100);
        size++;
    }

    @Override
    public Object get(int index) {
        return elementDatas[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementDatas, size)) + " size = " + size + " capacity = " + elementDatas.length;
    }
}
