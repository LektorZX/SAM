package coll1ComparIterator;

import java.util.Comparator;

public class LastNameSort implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
