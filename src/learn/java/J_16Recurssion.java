package learn.java;
// when function calls itself
public class J_16Recurssion {

    long factorial(int n){
        if(n==0)return 1;
        else return (n*factorial(n-1));
    }
    public static void main(String[] args) {

        J_16Recurssion obj1=new J_16Recurssion();
        System.out.println(obj1.factorial(20));
    }
}
