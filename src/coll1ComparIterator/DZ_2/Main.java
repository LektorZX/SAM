package coll1ComparIterator.DZ_2;
/*Используя итератор удалить из списка строк все строки длиной выше 4-х символов
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> str =new ArrayList<>();
        str.add("qwerer  ");
        str.add("qwerer  ");
        str.add("qw");
        str.add("qwerer  ");
        str.add("qwerer  ");
        str.add("qwe");
        str.add("qwerer ");
        str.add("qwerer  ");
        str.add("q");
        str.add("78");
        for (String s : str) {
            System.out.println(s);
        }
        Iter(str);
        System.out.println("---------------------------");
        for (String s : str) {
            System.out.println(s);
        }







    }
    private static <T>void Iter(Iterable<T> obj){
        Iterator<T> iterator=obj.iterator();
        while (iterator.hasNext()){
            T next=iterator.next();
            String q=next.toString();
            if(q.length()>4)
                iterator.remove();
        }

    }
}
