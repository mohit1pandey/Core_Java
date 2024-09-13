package Threads;

public class Threads_4 extends Thread{

    public Threads_4(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Thread is running");
        try {
            sleep(200); // if sleep is Interrupted throw and exception
        } catch (InterruptedException e) {
            System.out.println(" Sleep is Interrupted "+ e);
        }
    }

    public static void main(String[] args) {
        Threads_4 T1= new Threads_4("Second Thread");
        T1.start();
        T1.interrupt(); // interrupt the sleep
    }

}
