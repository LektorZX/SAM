package coll1ComparIterator.DZ_4;

import java.util.*;

/*
*2.	Создать класс Student, представляющий собой ученика. Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
          Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
          Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу, используя компараторы.

* */
public class Main {
    public static void main(String[] args) {
        List<Student>str=new LinkedList<Student>(Arrays.asList(
                new Student("Брюс", "Ли", 4),
                new Student("Брюс", "Aaa", 3),
                new Student("Джони", "Ли", 5),
                new Student("Вандам", "Жан", 8),
                new Student("Арни", "Шварценегер", 6)
        ));
        Iterator iterator=str.iterator();
        for (Student student : str) {
            System.out.println(student);
        }
        System.out.println("------------------------getBall");
        str.sort(Comparator.comparing(Student::getBall));
        for (Student student : str) {
            System.out.println(student);
        }
        str.sort(Comparator.comparing(Student::getFirstName));
        System.out.println("------------------------getFirstName");
        for (Student student : str) {
            System.out.println(student);
        }
        str.sort(Comparator.comparing(Student::getLastName));
        System.out.println("------------------------getLastName");
        for (Student student : str) {
            System.out.println(student);
        }
    }
}
