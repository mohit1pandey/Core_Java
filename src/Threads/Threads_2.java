package Threads;
// by extending Thread class
//public class Threads_2 extends Thread{
//    @Override
//    public void run() {
//        for(; ;){
//            System.out.println("This is Thread 2");
//            System.out.println(getName()); //inside inherited
//        }
//    }
//}

//by runnable interface.

public class Threads_2 implements Runnable{
    @Override
    public void run() {
        for(; ;){
            System.out.println("This is Thread 2");
            System.out.println(Thread.currentThread().getName());
        }
    }
}