package Threads.ExecutoresX;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executors_02 {
//we have to define what needs to be done core logic
    static private  long  factorial (int x){
        long result=1;

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }

        for (int i=x; i>=1;i--){
            result=i*result;
        }
        return result;
    }



    public static void main(String[] args) {

        long START_TIME=System.currentTimeMillis();

        ExecutorService executor= Executors.newFixedThreadPool(5);

        for(int i=1; i<=10;i++) {

            int finalI = i;  //final or effectively final
            executor.submit(() -> {
                System.out.println(factorial(finalI));
            });
        }
        executor.shutdown();        //orderly shutdown
//
//        try {
//            executor.awaitTermination(5, TimeUnit.SECONDS);  // wait for 10 sec and then continue xecution
//            // try chaning diffenrer values of time
//        }catch (InterruptedException e){
//            System.out.println(e.getCause());
//        }

        /* infinite wait till thread gets interrupted executed or */

        try {
            while (
             !executor.awaitTermination(5, TimeUnit.MILLISECONDS)){
//                System.out.println("infinite wait till thread gets interrupted executed or ");
            }
        }catch (InterruptedException e){
            System.out.println(e.getCause());
        }

    System.out.println("Total time taken by this thread to calculate factorials "+ (float)(System.currentTimeMillis() - START_TIME)/1000 );
    }
}

