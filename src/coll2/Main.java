package coll2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>(Comparator.comparing(String::hashCode));//по хеш коду сорт
        set.add("qwerty");
        set.add("qwty");
        set.add("qwety");
        set.add("qwery");
        set.add("erty");
        set.add("qwrty");
        set.add("qwet");
        System.out.println(set);
        System.out.println("--------------------------");
        Iterator iterator=set.iterator();
        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            System.out.println(next);
        }
        System.out.println("--------------------------");
        Map<String,Integer> mapa=new HashMap<>();
        mapa.put("qwe",123 );
        mapa.put("qwe1",1233 );
        mapa.put("qwe2",1234 );
        mapa.put("qwe3",1235 );
        mapa.put("qwe4",1236 );
        Set<String> x = mapa.keySet();                    //вывод ключи
        System.out.println(x);
        Collection<Integer> values = mapa.values();              //вывод значение 
        System.out.println(values);
        Set<Map.Entry<String, Integer>> entries = mapa.entrySet();   //вывод пар ключ значение 
        System.out.println(entries);

        ///вывод         можно вывести все по отдельности.
        mapa.forEach((k,v)->{
            System.out.println("----");
            System.out.println(v);});

    }
}
