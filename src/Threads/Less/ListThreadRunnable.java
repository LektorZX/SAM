package Threads.Less;

import java.util.List;

public class ListThreadRunnable implements Runnable {
    private final List<Integer>list;



    public ListThreadRunnable(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
       //     list.add(1); без захвата монитора тоже выполняется нос экспешном
            synchronized (list){
                list.add(1);
                System.out.println(Thread.currentThread().getName());
            }

        }

    }
}
