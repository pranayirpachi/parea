package pack_thread;

import java.util.Scanner;

public class priority_thread extends Thread{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread ");
        System.out.println("sahil");
        priority_thread ps = new priority_thread();
        Thread t1 = new Thread(ps);
        Thread t2 = new Thread(ps);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setName("sahil");
        t2.setName("pranay");
        t1.getName();
        t2.getName();
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
