package Threads.executorS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Semaphore1 {
    private static int COUNT=0;
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(1);//дает в захват 1 поток(дает захватить монитор одному потоку)
        ExecutorService executorService= Executors.newFixedThreadPool(5);//пул на два потока
        for (int i = 0; i <5 ; i++) {
            executorService.execute(new CounTest(semaphore));//принимает только ранебл,и потом уже создает п
        }
executorService.shutdown();
        try {
            executorService.awaitTermination(1L,TimeUnit.HOURS );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static class CounTest implements Runnable{
        private final Semaphore semaphore;

        public CounTest(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public void run() {

            for (int i = 0; i <50 ; i++) {
                try {
                    semaphore.acquire();//захватили семафор
                    System.out.println(++COUNT);
                    semaphore.release();//отпустили
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



            }



        }
    }
}
