package Threads;

public class Threads_6 extends Thread{

    public Threads_6(String name){
        super(name);
//        System.out.println(name + " Thread is running");
    }
    @Override
    public void run() {
        for(;;) {
            System.out.println(Thread.currentThread().getName() + " Thread is running");
            Thread.yield(); // make resources available for second thread as well
        }
    }


    public static void main(String[] args) {

        Threads_6 T2= new Threads_6("Thread2");
        Threads_6 T1= new Threads_6("Thread1");
        T1.start();
        T2.start();

    }

}


