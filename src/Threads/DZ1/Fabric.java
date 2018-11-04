package Threads.DZ1;

import java.util.List;
import java.util.Random;

public class Fabric implements Runnable {

    private final Random random = new Random();
    private final List<Integer> list;

    public Fabric(List<Integer> list) { this.list = list; }


    @Override
    public void run() {

        int r ;
        synchronized (list){
            for (int i = 0; i <30 ; i++) {
                for (int j = 0; j <4 ; j++) {
                    r = random.nextInt(100);
                    if(r%2==0){
                        list.add(1);
                    }else{
                        continue;
                    }
                }

            }

        }
        //next step



    }

    public void Constr(){





    }
}
