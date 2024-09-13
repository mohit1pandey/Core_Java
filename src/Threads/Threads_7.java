package Threads;

public class Threads_7 extends  Thread{

    @Override
    public void run () {
        while (true) {
            System.out.println("This is a Demon thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Threads_7 T1= new Threads_7();
        T1.setDaemon(true); // set as demon
        T1.start();
        Thread.currentThread().sleep(1000); /* allocate time for the T1 or else main will execute
        and demon will finish its execution*/
    }
}
