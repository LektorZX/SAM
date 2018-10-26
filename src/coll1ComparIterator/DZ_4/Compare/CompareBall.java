package coll1ComparIterator.DZ_4.Compare;

import coll1ComparIterator.DZ_4.Student;

import java.util.Comparator;

public class CompareBall implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getBall(),o2.getBall() );
    }
}
