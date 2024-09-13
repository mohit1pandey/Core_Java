package Threads;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
class CounterX{
    private int count =12;
    /*private int count2 =10;  try to read in count and wrote in count2 all time
     read will be paused as write runs */
    // crates locks:

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private  final Lock readLock= lock.readLock(); //readLock method returns read lock
    private  final Lock writeLock= lock.writeLock();


    public void getCount(){   //read operation
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+ " Says Value of count is " + count);
        }finally {
            readLock.unlock();
        }
    }
    public void incrementCount(){  //write operation
        writeLock.lock();
        try {
            //count2++;
            count++;
            System.out.println(Thread.currentThread().getName()+ " Says Count is Incremented To " + count);
        }finally {
            writeLock.unlock();
        }
    }
}


public class Threads_10 {

    public static void main(String[] args) {
        CounterX count=new CounterX();

        Runnable Read=new Runnable(){
            @Override
            public void run() {
                for(int i=1 ;i <=10 ;i++){
                count.getCount();
             }
            }
        };

        Runnable Write=new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    count.incrementCount();
                }
            }
        };


        Thread ReadThread1 = new Thread(Read, "ReadThread_1");
        Thread ReadThread2 = new Thread(Read, "ReadThread_2");
        Thread WriteThread = new Thread(Write, "WriteThread");

        ReadThread1.start();
        ReadThread2.start();
        WriteThread.start();
    }
}
