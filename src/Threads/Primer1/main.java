package Threads.Primer1;

public class main {
    public static void main(String[] args) {
        Count count=new Count();
        Thread q1=new Thr1(count);
        Thread q2=new Thr2(count);
        q1.start();
        q2.start();

        try {
            q1.join();
            q2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(count.getT());


        }
}
