package com.gczx.zzs;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zzs on 2019/9/6 21:08
 */
public class TreadDemo implements Runnable {
    public void run() {
        synchronized (this) {   //这边锁住的是t1这个对象
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()
                        + " synchronized loop " + i);
            }
        }
    }

    public static void main(String[] args) {    //在这里面锁住的不是同一个对象
        TreadDemo t1 = new TreadDemo();
        TreadDemo t2 = new TreadDemo();
        Thread ta = new Thread(t1, "A");
        Thread tb = new Thread(t1, "B");
        ta.start();
        tb.start();


    }
}
