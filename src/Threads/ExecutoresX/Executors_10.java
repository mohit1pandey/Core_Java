package Threads.ExecutoresX;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class action implements Runnable{
    String system;
    long time;
    CyclicBarrier barrier;

    public action(String system, long time,CyclicBarrier barrier){
        this.system=system;
        this.time=time;
        this.barrier=barrier;
    };

    @Override
    public void run() {
        System.out.println("Making connection to "+system+" . . . .");
        try {
            Thread.sleep(time);
            System.out.println(system+" Connection is established");
            barrier.await();

        } catch (InterruptedException | BrokenBarrierException  e) {
            System.out.println("something went wrong");
        }
    }
}


public class Executors_10 {

    public static void main(String[] args) {
        int noOfThreads=3;
        CyclicBarrier barrier= new CyclicBarrier(noOfThreads,()->{
            System.out.println("all connections are tested you can perform you task");
        });
        ExecutorService executor= Executors.newFixedThreadPool(noOfThreads);
        //bd connection
        executor.submit(new action("DB",4000,barrier));
        //api post
        executor.submit(new action("http://google.com/getControl/APIX",5000,barrier));
        //mail server check
        executor.submit(new action("SMTP",3000,barrier));
        executor.shutdown();
        System.out.println("main");
    }

}


