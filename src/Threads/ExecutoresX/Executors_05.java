package Threads.ExecutoresX;

import java.util.concurrent.*;

public class Executors_05 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        ScheduledFuture <String> future =scheduler.schedule(()->"This task is scheduled for after 10 sec", 10 , TimeUnit.SECONDS);
        System.out.println( future.get());
        scheduler.shutdown();
    }
}
