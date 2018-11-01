package ZapKniga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Logic {

    List<ClassMod> kniga = new ArrayList<>();

    public Logic() {
        this.kniga.add(new ClassMod("1", " 1  ", 123456));
        this.kniga.add(new ClassMod("23", " 23  ", 1243456));
        this.kniga.add(new ClassMod("44", " 44  ", 1253456));
        this.kniga.add(new ClassMod("11", " 11  ", 1263456));
        this.kniga.add(new ClassMod("87", " 87  ", 1273456));
        this.kniga.add(new ClassMod("86", " 86  ", 1283456));
        this.kniga.add(new ClassMod("55", " 55  ", 1234756));
        this.kniga.add(new ClassMod("56", " 64  ", 1234656));
        this.kniga.add(new ClassMod("46", " 65  ", 1234556));
        this.kniga.add(new ClassMod("35", " 55  ", 1234456));
        this.kniga.add(new ClassMod("34", " 43  ", 123436));
        this.kniga.add(new ClassMod("23", " 23  ", 1234256));
    }

    public void see() {
        if(!kniga.isEmpty()) {
            for (ClassMod classMod : kniga) {
                System.out.println(classMod);
            }
        }
        else {
            System.out.println("Массив пуст !!!");
        }

    }

    public void seah(){
        System.out.println("Введите имя");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        Iterator<ClassMod> iterator=kniga.iterator();
        while (iterator.hasNext()){
            String s=iterator.next().getName();
            if(s.equals(i)){
                System.out.println(iterator.next().toString());
            }
        }
    }

    public void Add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name ");
        String i = sc.nextLine();
        System.out.println("lastName ");
        String i1 = sc.nextLine();
        System.out.println("number ");
        int a = sc.nextInt();
        this.kniga.add(new ClassMod(i,i1,a));
        System.out.println(" Данные добавлены ");
    }
    public void Dell(){
        kniga.clear();
    }
}
