package Threads.DZ1;
/*Двое безумных учёных устроили соревнование, кто из них соберёт больше роботов за 100 ночей.
Для этого каждую ночь каждый из них отправляет своего прислужника на свалку фабрики роботов за деталями.
Чтобы собрать одного робота им нужно:
Голова, Тело, Левая рука, Правая рука, Левая нога, Правая нога, CPU, RAM, HDD
В первую ночь на свалке находится 20 случайных деталей. Каждую ночь фабрика выбрасывает на свалку от 1 до 4 случайных деталей.
В то же самое время прислужники обоих учёных отправляются на свалку, и каждый собирает от 1 до 4 случайных деталей.
 Если на свалке деталей нет – прислужник уходит ни с чем.
Затем они возвращаются домой и отдают детали хозяевам.
Учёные пытаются собрать как можно больше роботов из деталей, которые они получили.
Написать программу, симулирующую этот процесс. Для симуляции принять, что каждая ночь наступает через 100мс.
Фабрика и два прислужника действуют в одно и то же время.
После 100 ночей (около 10 секунд) определить победителя соревнования.

*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tich tich1 = new Tich(new Sleave());//два ученых
        Tich tich2 = new Tich(new Sleave());
        List<Integer> listThread1 = new ArrayList<>();//массив для детелаей
        List<Integer> listThread2 = new ArrayList<>();
        //до 100
        Thread q1 = new Thread(new Fabric(listThread1));//два потока
        Thread q2 = new Thread(new Fabric(listThread2));
        q1.start();//старт(выполнение метода run()
        q2.start();
        for (int i = 0; i < 30; i++) {//30 ночей
            try {
                q1.sleep(100L);//сон
                q2.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int a = tich1.SborRobots(listThread1);//считаем сколько можно собрать роботов
        int b = tich2.SborRobots(listThread2);
        if(a>b)
            System.out.println("a "+a);
        else
            System.out.println("b "+b);
        if(a==b)
            System.out.println("ничья "+a+"---"+b);
    }
}
