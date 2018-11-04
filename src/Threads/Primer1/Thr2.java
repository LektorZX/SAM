package Threads.Primer1;

public class Thr2 extends Thread {
    private Count count;

    public Thr2(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            count.foo();
        }
    }
}
