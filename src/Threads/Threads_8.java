package Threads;
//counter class
class Counter{
    private  int count=0;
    private String name;

    public  void increment_count(){
       count++;
    }
    public void print_count(){
        System.out.println("the count value is "+count);
    }
}

// thread class
public class Threads_8 extends Thread{
    public  Counter counter;

    public Threads_8(Counter counter){
        this.counter=counter;
    }


    @Override
    public void run() {
        for (int i=1; i<=1000;i++){

        counter.increment_count();
        }

    }
// main method
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
        Threads_8 T1=new Threads_8(counter);
        Threads_8 T2=new Threads_8(counter);

        T1.start();
        T2.start();
        T1.join();
        T2.join();

        counter.print_count();

    }

}

