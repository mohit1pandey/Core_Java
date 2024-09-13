package Threads.ExecutoresX;

public class Executors_01 {

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
        //from 1 to 5
        //lets calculate the time of the computation
        long START_TIME=System.currentTimeMillis();


        Thread[] threads =new Thread[10]; // array of 10 threads

        for(int i=1; i<=10;i++){

            int finalI = i;  //final or effectively final
            threads[i-1]= new Thread( ()->{

                System.out.println(factorial(finalI));

            });

            threads[i-1].start();
        }


        for (Thread T: threads){
            try{
              T.join();
            }catch(InterruptedException e)  {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Total time taken by this thread to calculate factorials "+ (float)(System.currentTimeMillis() - START_TIME)/1000 );
    }
}
/*




public class Executors_01 {

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
        //from 1 to 5
        //lets calculate the time of computation
        long START_TIME=System.currentTimeMillis();

        for(int i=1; i<=10;i++){

            int finalI = i;  //final or effectively final
            Thread thread= new Thread( ()->{
                System.out.println("Thread "+ finalI+ " ran");
            System.out.println(factorial(finalI));


            });

            thread.start();


        }



        System.out.println("Total time taken by this thread to calculate factorials "+ (float)(System.currentTimeMillis() - START_TIME)/1000 );
    }

}
*/

/*

public class Executors_01 {

static private  long  factorial (int x){
        long result=1;
    try {
        Thread.sleep(1000);  //calculation is super complex and takes 1 sec
    }catch (InterruptedException e){
        System.out.println(e);
    }

    for (int i=x; i>=1;i--){
        result=i*result;
    }
    return result;
}



    public static void main(String[] args) {
        //from 1 to 5
        //lets calculate the time of the computation
        long START_TIME=System.currentTimeMillis();

        for(int i=1; i<=10;i++){
            System.out.println(factorial(i));
        }
        System.out.println("Total time taken by this thread to calculate factorials "+ (float)(System.currentTimeMillis() - START_TIME)/1000 );
    }

}

*/