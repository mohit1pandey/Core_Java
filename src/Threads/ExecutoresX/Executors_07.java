package Threads.ExecutoresX;
//count down latch

import java.util.concurrent.*;

class task implements Runnable{

    private final CountDownLatch latch;

    task(CountDownLatch latch){
        this.latch=latch; //a countdown obj
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+ " is started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            latch.countDown();
        }
    }
}

public class Executors_07 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfTask=3;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfTask);

        CountDownLatch latch= new CountDownLatch(numberOfTask);

        Future<?> res1=executor.submit(new task(latch));
        Future<?> res2=executor.submit(new task(latch));
        Future<?> res3=executor.submit(new task(latch));
        executor.shutdown();

        latch.await();
//        res1.get();
//        res2.get();
//        res3.get();
        System.out.println("main thread is ran");
    }
}

/*package Threads.ExecutoresX;
//count down latch

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class task implements Runnable{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+ " is started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Executors_07 {
    public static void main(String[] args) {
        int numberOfTask=3;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfTask);
        executor.submit(new task());
        executor.submit(new task());
        executor.submit(new task());
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main thread is ran");
    }
}

*/