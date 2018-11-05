package Threads.executorS;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        ExecutorService executorService= Executors.newFixedThreadPool(2);//пул на два потока
        executorService.execute(new SH(countDownLatch));//принимает только ранебл,и потом уже создает поток
executorService.execute(new Rosket(countDownLatch));
        }


        public static class Rosket implements Runnable{

        private final CountDownLatch countDownLatch;

            public Rosket(CountDownLatch countDownLatch) {
                this.countDownLatch = countDownLatch;
            }

            @Override
            public void run() {
                try {
                    countDownLatch.await();
                    System.out.println("поехали");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        public static class SH implements Runnable{
            private final CountDownLatch countDownLatch;

            public SH(CountDownLatch countDownLatch) {
                this.countDownLatch = countDownLatch;
            }

            @Override
            public void run() {
                for (int i = 5; i >0 ; i--) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    countDownLatch.countDown();
                    System.out.println("-1");

                }

            }
        }

}
