package learn.java;

public class J_15Method_Overlaoding {

    int sum(int... numbers) {

        int sum=0;
        for(int i: numbers){
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {

        J_15Method_Overlaoding obj1= new J_15Method_Overlaoding();
        System.out.println(obj1.sum(10,20,30));
        System.out.println(obj1.sum(10,30));
        System.out.println(obj1.sum());// no arg in argument vector sum will be zero
    }
}
