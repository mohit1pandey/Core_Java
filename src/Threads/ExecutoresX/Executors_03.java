package Threads.ExecutoresX;

import java.util.concurrent.*;

public class Executors_03 {

        public static void main(String[] args) throws ExecutionException, InterruptedException {
            ExecutorService executor = Executors.newSingleThreadExecutor();

        /*
//        runnable vs callable
            Runnable Task= ()->{ //anonymous class
                System.out.println("This is Task  1");

            };
            Callable Task1= ()->{ //anonymous class

                return ("This is Task  2");

            };

            Future<?> submit= executor.submit(Task1);  // subit method get over loaded with diff params
            submit.get();
            executor.shutdown();
        */

//            shutdown and isterminated()

            Future<Integer> future=executor.submit(()->{
               return 20;
            });
            System.out.println(future.get());
            executor.shutdown();
            Thread.sleep(1000); // wait then print isTerminated.
            boolean terminated = executor.isTerminated();
            System.out.println(terminated);

        }


    }


    /*

package Threads.ExecutoresX;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executors_03 {


        public static void main(String[] args) throws ExecutionException, InterruptedException {
            ExecutorService executor = Executors.newSingleThreadExecutor();

            Future<Integer> submit = executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                return 34;});

            System.out.println(submit.get()); //waits for the completion of the task and then prints it

            if(submit.isDone()){   // returns true if task gets completed
                System.out.println("task Completed");
            }
            executor.submit(()-> System.out.println("the task is executing again" +Thread.currentThread().getName()));
            executor.shutdown();
        }

    }

    */

