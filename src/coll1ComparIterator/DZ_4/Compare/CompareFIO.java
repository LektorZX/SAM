package coll1ComparIterator.DZ_4.Compare;

import coll1ComparIterator.DZ_4.Student;

import java.util.Comparator;

public class CompareFIO implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
