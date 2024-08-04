package thread.collection.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface SimpleList {
    int size();

    void add(Object o);

    Object get(int index);
}
