package coll1ComparIterator;

import java.util.Comparator;

public class AgeSort implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return Integer.compare(o1.getAge(),o2.getAge() );
    }
}
