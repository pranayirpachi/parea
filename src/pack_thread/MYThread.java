package pack_thread;

public class MYThread implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+"entered");
            System.out.println("java is ");
            Thread.sleep(10000);
            System.out.println("Interesting");
            System.out.println(Thread.currentThread().getName()+"exit");

        }catch (Exception ex)
        {
            System.out.println("Error in Display Class");
        }
    }
}
