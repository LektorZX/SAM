package coll1ComparIterator;

import java.util.Comparator;

public class FeeSort implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        return Integer.compare(o1.getFee(), o2.getFee());
    }
}
