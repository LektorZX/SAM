package coll2.DZ_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Garage {
    Map<Car, Integer> car = new HashMap<>();

    public Garage() {
        Map<Car, Integer> car1 = new HashMap<>();

        Honda qwe1 = new Honda("Хонда", "аккорд", 1999);
        car1.put(qwe1, 1);
        Mers mers = new Mers("Мерс", "109", 1995);
        car1.put(mers, 2);
        Bmw bmw = new Bmw("бмв", "303", 1988);
        car1.put(bmw, 8);
        Mits mits = new Mits("миц", "еклипс", 1990);
        car1.put(mits, 5);
        this.car = car1;
    }

    public void see() {
        Set<? extends Map.Entry<? extends Car, Integer>> entries = car.entrySet();
        System.out.println(entries);

    }
    public void in(Car obj) {
        boolean containsKey = car.containsKey(obj);
        int vel=car.get(obj);
        car.put(obj, vel+1);
        System.out.println("in");


    }
    public void out(Car obj) {
        boolean containsKey = car.containsKey(obj);
        int vel=car.get(obj);
        car.put(obj, vel-1);
        System.out.println("out");


    }
    public void seach(Car obj) {
        boolean containsKey = car.containsKey(obj);
        int vel=car.get(obj);
        System.out.println(vel+"coll");


    }

}