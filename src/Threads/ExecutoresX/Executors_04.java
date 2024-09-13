package Threads.ExecutoresX;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Executors_04 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor= Executors.newSingleThreadExecutor();

        Callable <Integer> Task1= ()->{
            Thread.sleep(1000);
            System.out.println("This is Task1");
            return 1;
        };

        Callable <Integer> Task2= ()->{
            Thread.sleep(1000);
            System.out.println("This is Task2");
            return 2;
        };

        Callable <Integer> Task3= ()->{
            Thread.sleep(1000);
            System.out.println("This is Task3");
            return 3;
        };

        List<Callable<Integer>> tasks= Arrays.asList(Task1,Task2,Task3);
/*
        //        executor.invokeAll(tasks);
        executor.invokeAll(tasks,2005, TimeUnit.MILLISECONDS);
        executor.shutdown();
*/
//        invoke any
        try {
            executor.invokeAny(tasks);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        finally {
            executor.shutdown();
        }
    }
}
