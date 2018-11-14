package Threads.executorS.DZ1;
/*1. Написать программу, бесконечно считывающую пользовательские числа из консоли.
Эти числа представляют собой количество секунд.
При каждом вводе числа, должна создаваться задача, которая засыпает на введённое число секунд и затем выводит "Я спал N секунд".
Однако нужно сделать так, чтобы все задачи выполнялись в одном и том же потоке в порядке ввода.
Т.е. в программе есть 2 потока: главный и поток для выполнения всех задач по очереди.
При вводе -1 программа должна завершать свою работу.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        try (Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {
            while (true) {
                int number = scanner.nextInt();
                if (number == -1) {
                    break;
                }
                executorService.execute(new CustomRunnable(number));
            }
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(1L, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static class CustomRunnable implements Runnable{

        private int second;

        public CustomRunnable(int second) {
            this.second = second;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(second * 1000L);
                System.out.println("Я спал " + second + " секунд");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
