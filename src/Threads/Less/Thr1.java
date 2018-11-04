package Threads.Less;

public class Thr1 extends Thread {
    private Count count;

    public Thr1(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            count.foo();
        }
    }
}
