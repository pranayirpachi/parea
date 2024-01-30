package pack_thread;

import java.util.Scanner;

public class Thread_all_condition extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Thread_all_condition ts = new Thread_all_condition();
        System.out.println("main tread start");
        Thread t1 = new Thread(ts);
        Thread t2 = new Thread(ts);
        Thread t3 = new Thread(ts);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.setName("pranay");
        t2.setName("sahil");
        t3.setName("sanjay");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("main ends ");

    }
}
