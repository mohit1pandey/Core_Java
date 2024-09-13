package Threads;

public class Threads_5 extends Thread{

    public Threads_5(String name){
        super(name);
//        System.out.println(name + " Thread is running");
    }
    @Override
    public void run() {
        for(;;) {
            System.out.println(Thread.currentThread().getName() + " Thread is running");
            try {
                sleep(200); // if sleep is Interrupted throw and exception
            } catch (InterruptedException e) {
                System.out.println(" Sleep is Interrupted " + e);
            }
        }
    }


    public static void main(String[] args) {
        Threads_5 T3= new Threads_5("Thread3");
        Threads_5 T2= new Threads_5("Thread2");
        Threads_5 T1= new Threads_5("Thread1");
        T1.setPriority(Thread.MAX_PRIORITY);
        T2.setPriority(Thread.NORM_PRIORITY);
        T3.setPriority(Thread.MIN_PRIORITY);
        T1.start();
        T2.start();
        T3.start();
    }

}
