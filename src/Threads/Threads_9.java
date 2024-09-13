 package Threads;

 import  java.util.concurrent.TimeUnit;
 import  java.util.concurrent.locks.Lock;
 import  java.util.concurrent.locks.ReentrantLock;


 class Bank {
     private int balance = 7000;

     //now to use locks make a variable which is instance of ReentrantLock

     private  final  Lock lock=new ReentrantLock();
     public void withdraw(int amount) throws InterruptedException {
         if(lock.tryLock(1000,TimeUnit.MILLISECONDS)) { // if lock is free so take it or else finish the thread
             try {

                 System.out.println(Thread.currentThread().getName() + " is trying to widhraw amount " + amount);
                 //check for sufficient bal
                 if (balance >= amount) {
                     //proceed for transaction this sleep time is due to database calculations.
                     Thread.sleep(10000);
                     balance -= amount;
                 } else {
                     System.out.println(Thread.currentThread().getName() + " says" + balance + " is insufficient");
                 }
                 System.out.println(Thread.currentThread().getName() + " Says the current amount is " + balance);

             } catch (InterruptedException e) {
                 System.out.println("Interrupt exception occurred " + e);
             } finally {
                 lock.unlock(); //release the lock
             }
         }
         else {
             // if thread one is consuming lock so two will execute this else block and wont wait for lock to be released
             System.out.println(Thread.currentThread().getName() +" saya another thread is consumed the lock");
         }
     }
 }

 public class Threads_9 {
     public static void main(String[] args) {
         //create bank obj
         Bank sbi= new Bank();
         // annoynous class
         Runnable task=new Runnable() {
             @Override
             public void run() {
                 try {
                     sbi.withdraw(5000);
                 } catch (InterruptedException e) {

                 }
             }
         };

         Thread T1= new Thread(task, "Thread1");
         Thread T2= new Thread(task,"Thread2");

         T1.start(); T2.start();
     }

 }

 // Example of lock
  /* package Threads;

import  java.util.concurrent.TimeUnit;
import  java.util.concurrent.locks.Lock;
import  java.util.concurrent.locks.ReentrantLock;


class Bank {
    private int balance = 7000;

//      public synchronized void withdraw(int amount) throws InterruptedException {

    //now to use locks make a variable which is instance of ReentrantLock

    private  final  Lock lock=new ReentrantLock();
    public void withdraw(int amount) throws InterruptedException {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " is trying to widhraw amount " + amount);
            //check for sufficient bal
            if (balance >= amount) {
                //proceed for transaction this sleep time is due to database calculations.
                Thread.sleep(10000);
                balance -= amount;
            } else {
                System.out.println(Thread.currentThread().getName() + " says" + balance + " is insufficient");
            }
            System.out.println(Thread.currentThread().getName() + " Says the current amount is " + balance);
        }catch (InterruptedException e){
            System.out.println("Interrupt exception occurred " +e);
        }
        finally {
            lock.unlock();
        }
    }
}

public class Threads_9 {
     public static void main(String[] args) {
         //create bank obj
         Bank sbi= new Bank();
         // anonymous class
         Runnable task=new Runnable() {
             @Override
             public void run() {
                 try {
                     sbi.withdraw(5000);
                 } catch (InterruptedException e) {

                 }
             }
         };

         Thread T1= new Thread(task, "Thread1");
         Thread T2= new Thread(task,"Thread2");

         T1.start(); T2.start();
     }

    }
*/
