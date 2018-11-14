package Threads.executorS.DZ1;
/*3*. Задан массив случайных целых чисел (от 1 до 300) случайной длины (до 1 млн элементов).
Найти максимальный элемент в массиве двумя способами: в одном потоке и используя 10 потоков.
Сравнить затраченное в обоих случаях время.
*/
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main3 {
    private static final Random random=new Random(300);
    public static void main(String[] args) {
        int a=random.nextInt(1000000);
        int []arr=new int[a];
        new Thread(new SortArr(arr));

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= random.nextInt(300);
        }
        Thread qwe1=new Thread(new SortArr(arr));
        qwe1.start();


        ExecutorService executorService= Executors.newFixedThreadPool(10);//пул на два потока
        for (int i = 0; i <10 ; i++) {
            executorService.execute(new SortArr(arr));//принимает только ранебл,и потом уже создает п
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1L,TimeUnit.HOURS );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        }


public static class SortArr implements Runnable{
        private static int []arr;

    public SortArr(int []arr) {
    this.arr=arr;
    }

    @Override
    public void run() {

        synchronized (arr){
            Long timein=System.nanoTime();
            System.out.println(Thread.currentThread()+"поток зашел");
            int max=arr[0];
            for (int i = 0; i <arr.length ; i++) {
                if(max<arr[i])
                    max=arr[i];
            }
            System.out.println(max);

            Long timeout=System.nanoTime()-timein;
            System.out.println(Thread.currentThread()+" поток вышел время ---"+timeout);

        }



    }
}



}
