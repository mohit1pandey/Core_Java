package Threads.ExecutoresX;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Executors_06 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler= Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> System.out.println("Task Wtih fixed rate"), 5, 3,TimeUnit.SECONDS);
    // normal shut down wont work we exepicitly have to write code for that
        //now scheudle a new task for shutdown

        scheduler.schedule(()-> {
            System.out.println("initiating shutdown .....");
            scheduler.shutdown();
        },20, TimeUnit.SECONDS);

    }
}
