package Threads;
// thread communication

class SharedResource{
    private int data;
    private boolean hasData=false; //by default value is false

    public synchronized void produce(int data){
        if(hasData){
            try {
                wait();  //make this thread to wait
            }catch (InterruptedException e){
                System.out.println("Thread is interrupted"+ e);
            }
        }
        this.data= data;
        System.out.println("Produced " + data);
        hasData=true;
        notify();
    }

    public synchronized int consume(){
        if(!hasData){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Thread is interrupted"+ e);
            }
        }
        hasData=false;  // this should be here
        System.out.println("Thread has consumed data " + data);
        notify();
        return data;
    }
}
//create two thread obj

class Provider implements Runnable{
    SharedResource s1;

    Provider(SharedResource s1){
        this.s1=s1;
    }

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            s1.produce(i);
        }
    }
}

class Consumer implements Runnable{
    SharedResource s1;

    Consumer(SharedResource s1){
        this.s1=s1;
    }
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            s1.consume();
        }
    }
}

public class Threads_12 {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread providerThread = new Thread(new Provider(sharedResource));
        Thread consuerThread = new Thread(new Consumer(sharedResource));

        consuerThread.start();
        providerThread.start();
    }

}