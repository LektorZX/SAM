package Threads.executorS.DZ1;
/*2. Напишите программу, моделирующую кассы в магазине. Существует несколько касс, работающих одновременно.
Каждый покупатель - отдельный тред.
Общее количество покупателей может быть больше, чем количество касс, но одновременно не может обрабатываться больше покупателей,
чем имеется рабочих касс.
У каждого покупателя есть набор товаров, которые должны быть выведены в процессе обслуживания.
*/


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Main2 {
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(2);
        ExecutorService executorService= Executors.newFixedThreadPool(20);//пул на два потока
        for (int i = 0; i <20 ; i++) {
            executorService.execute(new Main2.CounTest(semaphore));//принимает только ранебл,и потом уже создает п
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
                try {
                    semaphore.acquire();//захватили семафор
                    System.out.println(Thread.currentThread()+"обслуживается в кассе");
                    Thread.sleep(120L);
                    System.out.println(Thread.currentThread()+"out");
                    semaphore.release();//отпустили
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}
