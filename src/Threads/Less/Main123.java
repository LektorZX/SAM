package Threads.Less;

import java.util.ArrayList;
import java.util.List;

public class Main123 {
    public static void main(String[] args) {
        List<Integer> listThread = new ArrayList<>();
        Thread q1=new Thread(new ListThreadRunnable(listThread));
        Thread q2=new Thread(new ListThreadRunnable(listThread));
        q1.start();
        q2.start();
        System.out.println(Thread.currentThread().getName());

        try {
            q2.join();
            q1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(listThread.size());
    }
}
