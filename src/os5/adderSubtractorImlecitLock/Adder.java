package os5.adderSubtractorImlecitLock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;
    private Lock lock;
    public Adder(Count count , Lock lock){
        this.count = count;
        this.lock = lock;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            synchronized (count){
                this.count.num++;
            }

        }
    }
}
