package sortedClases;

import java.util.Comparator;

public interface Sorted<T extends Comparable<T>> extends Comparator<T> {

    public int compare(T o1, T o2);
}
