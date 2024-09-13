package Threads;
import Threads.Threads_2;  //import Thread_2
// default main thread
public class Threads_1 {

    public static void main(String[] args) {
        Threads_2 T2= new Threads_2(); //create a obj of Thread_2
//        T2.start(); // runs the run method in case if Thread class is extended
        Thread T1=new Thread(T2); // now T1 is able to access the methods of
        T1.start();


        for(;;){
            System.out.println(Thread.currentThread().getName());
            System.out.println("This is main Thread");
        }
    }

}
