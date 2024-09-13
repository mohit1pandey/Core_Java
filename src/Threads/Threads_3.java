package Threads;

public class Threads_3 extends Thread{

    @Override
    public void run() {
        System.out.println("This is T1 Thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Threads_3 T1= new Threads_3();
        System.out.println(T1.getState()); // NEW state
        T1.start();
        System.out.println(T1.getState());//RUNNABLE
        System.out.println(Thread.currentThread().getState()); // For main thread RUNNING
        Thread.sleep(1000); //sleep the main thread for 1 sec let the T1 to run
                                    // This sleep method can cause exception
        System.out.println(T1.getState());  //WAITING or TIMED_WAITING
        T1.join();  // holds the CPU until the T1 is executed

        System.out.println(T1.getState()); // TERMINATED

    }
}
