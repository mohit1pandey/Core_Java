package learn.java;

public class J_11Methods {

    // method declaration
    int calculate(int a,int b){ // a and b are formal arguments
        return (a+b);   //returns
    }
    public static void main(String[] args) {
        //as being a instance method only obj can call it.

        J_11Methods calculator = new J_11Methods();
        int result=calculator.calculate(2666,7888);
        System.out.println(result);
    }
}
