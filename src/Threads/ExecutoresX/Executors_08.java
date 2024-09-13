package Threads.ExecutoresX;
//count down latch

import java.util.concurrent.*;

class taskx implements Runnable{

    private final CyclicBarrier barrier;

    taskx(CyclicBarrier barrier){
        this.barrier=barrier; //a countdown obj
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+ " is started");

        try {
            Thread.sleep(1000);
            barrier.await();  //last me aayega
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }

}

public class Executors_08 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfTask=3;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfTask); //should equal to no of threads

        CyclicBarrier barrier = new CyclicBarrier(numberOfTask);

        Future<?> res1=executor.submit(new taskx(barrier));
        Future<?> res2=executor.submit(new taskx(barrier));
        Future<?> res3=executor.submit(new taskx(barrier));
        executor.shutdown();
//        barrier.getNumberWaiting();
//        barrier.getParties();

        System.out.println("main thread is ran");
    }
}
