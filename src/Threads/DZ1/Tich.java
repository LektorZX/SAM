package Threads.DZ1;

import java.util.List;

public class Tich {
    Sleave slave;

    public Tich(Sleave slave) {
        this.slave = slave;
    }

    public int SborRobots(List<Integer>list){
        return list.size()/8;
    }

}
