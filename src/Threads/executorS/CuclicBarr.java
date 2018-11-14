package Threads.executorS;

import java.util.Random;
import java.util.concurrent.*;

public class CuclicBarr {
    private static final Random random=new Random();
    public static void main(String[] args) {
        RocketPart[] rocketParts=RocketPart.values();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(rocketParts.length, new Runnable() {
            @Override
            public void run() {
                System.out.println("GO!!!");
            }
        });
        ExecutorService executorService= Executors.newFixedThreadPool(rocketParts.length);//пул на два потока
       // ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (RocketPart rocketPart : rocketParts) {
            executorService.execute(new RocketPartRunnabe(cyclicBarrier,rocketPart));
        }
        System.out.println("OK");

        executorService.shutdown();
        try {
            executorService.awaitTermination(1L, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

        public static class RocketPartRunnabe implements Runnable{
            private final CyclicBarrier cyclicBarrier;
            private final RocketPart rocketPart;

            public RocketPartRunnabe(CyclicBarrier cyclicBarrier, RocketPart rocketPart) {
                this.cyclicBarrier = cyclicBarrier;
                this.rocketPart = rocketPart;
            }
            @Override
            public void run() {
                try{
                System.out.println(Thread.currentThread().getName());
                int waitingTime = random.nextInt(10) + 5;
                Thread.sleep(waitingTime * 100L);
                System.out.println(rocketPart + " готова. Время готовки: " + waitingTime);
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }


        }
        }
}
