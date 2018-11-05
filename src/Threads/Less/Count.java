package Threads.Less;

public class Count {

    private final Object LOCK=new Object();


    private int t=0;
    public synchronized void  foo(){//синхрон метода
        this.t++;
//        synchronized (this){ синхрон блок ---лучше ставить (LOCK) предпочтительно и гибко(можно синхрон другой блок другим или тем же
//            this.t++;
//        }
    }




    public int getT() {
        return t;
    }
}
