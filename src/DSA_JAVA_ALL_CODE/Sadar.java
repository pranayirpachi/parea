package DSA_JAVA_ALL_CODE;

interface Sadar {
    public static void road(){
        System.out.println("fast vehicle is travelling");
    }

    interface kp{
       static void rainheavy(){
           System.out.println("holds are large in this areas");

        }
    }
   class amravati implements Sadar,kp
   {
       void rainheavy(){
           System.out.println("come in this area of nagpur ");
       }
    void road(){
        System.out.println("slow in this area of pune");
    }
   }
   public static void main(String args[]){
        amravati am = new amravati();
        am.road();
        am.rainheavy();
   }
}
