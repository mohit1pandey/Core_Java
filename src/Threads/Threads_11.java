package Threads;

//Deadlock
class Pen{

    public synchronized void writeWithPenAndPaper(Paper paper){ //common in both
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper " + paper);
        paper.finishWriting();  //if writing is finished
    }
    public synchronized void finishWriting(){
        System.out.println("pen finished writing using pen and paper");
    }
}

class Paper{
    public synchronized void writeWithPenAndPaper(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper " + pen);
        pen.finishWriting();  // if writing is finished
    }

    public synchronized void finishWriting(){
        System.out.println("paper finished writing using pen and paper");
    }
}

class Task1 implements Runnable{

    private Pen pen;
    private Paper paper;

    Task1(Pen pen,Paper paper){
        this.pen=pen;
        this.paper=paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);
    }
}

class Task2 implements Runnable{
    private Pen pen;
    private Paper paper;


    Task2(Pen pen,Paper paper){
        this.pen=pen;
        this.paper=paper;
    }

    @Override

    /*
    public void run() {
            paper.writeWithPenAndPaper(pen);
        }
    }*/

    public void run() {
        synchronized (pen) {  // adding this line tells if pen is free then only lock the paper then pen
            paper.writeWithPenAndPaper(pen);
        }
    }
}

public class Threads_11 {
    public static void main(String[] args) {

        Pen pen= new Pen();
        Paper paper= new Paper();

        Thread thread1= new Thread(new Task1(pen,paper),"Thread-1");
        Thread thread2= new Thread(new Task2(pen,paper),"Thread-2");

        thread1.start();
        thread2.start();

    }


}
