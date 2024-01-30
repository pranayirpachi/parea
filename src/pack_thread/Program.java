package pack_thread;

public class Program {
    public static void main(String[] args) {
        try {
            System.out.println("Main starts");
            MYThread objMT = new MYThread();
            Thread t1 = new Thread(objMT);
            Thread t2 = new Thread(objMT);
            Thread t3 = new Thread(objMT);
            t3.setPriority(Thread.MAX_PRIORITY);
            t1.setPriority(Thread.MIN_PRIORITY);
            t2.setPriority(Thread.NORM_PRIORITY);
            t1.setName("Samsung");
            t2.setName("Motorola");
            t3.setName("Apple");
            t1.start();
            t2.start();
            t3.start();
            t1.join();
            t2.join();
            t3.join();
            System.out.println("Main ends");
        }
        catch (Exception ex){
            System.out.println("Error in P program class ");

        }
    }
}
