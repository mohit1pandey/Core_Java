package learn.java;

public class J_07Loops {
    public static void main(String[] args) {
        int itr=10;

        while (itr>=1){
        System.out.println(itr);
        --itr;
    }
        //for loop

        int  sum=0;
        for(int i=1; i<=100; i++){
            sum +=i;

        }
        System.out.println("the sum is" + sum);
    }

}
