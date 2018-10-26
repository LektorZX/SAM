
/* Создать класс Actor с полями firstName, lastName и fee (гонорар).
Создать ArrayList<Actor>, добавить в него несколько актёров с данными.
Написать метод fire, принимающий List<Actor> и удаляющий из списка актёра с наибольшим гонораром.
Вывести элементы модифицированной коллекции.
Добавить в класс Actor возраст актёра. Написать компаратор, который позволит отсортировать список актёров по их возрасту

*/


package coll1ComparIterator;
import java.util.*;


public class Main {
    public static void main(String[] args) {



        List<Actor> actors =new ArrayList<>(Arrays.asList(
                new Actor("Брюс", "Ли", 5000,35),
                new Actor("Брюс", "Aaa", 5500,45),
                new Actor("Джони", "Ли", 5000,47),
                new Actor("Вандам", "Жан", 2500,55),
                new Actor("Арни", "Шварценегер", 5500,28)
        ));

       // actors.sort(Comparator.comparing(Actor::getFee).thenComparing(Actor::getFirstName));
        actors.sort(Comparator.comparing(Actor::getFee));
        Iter(actors);
        System.out.println("----------------------------");
       findMax(actors);
        Iter(actors);
        System.out.println("----------------------------");
        actors.sort(Comparator.comparing(Actor::getAge));
        Iter(actors);


//        Collections.sort(actors);
//        Iter(actors);
//        System.out.println("----------------------------");
//        actors.sort(new LastNameSort());
//        Iter(actors);
//        System.out.println("----------------------------");
//        actors.sort(new FeeSort());
//        Iter(actors);
//        fire(actors);

    }
    private static <T> void fire(T qwe) {



    }
    private static <T>void Iter(Iterable<T> obj){
        Iterator<T> iterator=obj.iterator();
        while (iterator.hasNext()){
            T next=iterator.next();
            System.out.println(next);
        }

    }
    private static void findMax(List<Actor> list) {
        int o1 = list.size();
        o1 -= 1;
        int q1 = list.get(o1).getFee();
        int wen = q1;
        Iterator<Actor> iterator=list.iterator();
        while (iterator.hasNext()){
            Actor next=iterator.next();
            if(next.getFee()==wen){
                iterator.remove();
            }

        }
    }





}
