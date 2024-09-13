package learn.java;
// try catch and the stack tree in exception

class Exception1{
    //method 1
    private void divide(int a,int b){
        try{
            int c=a/b;  //possibly can throw an exception
            System.out.println("the value of "+ a+"/"+b+" is "+c);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The requested index does not Exist" + e);
        }
    }
    //method 2

    public void call_divide(int a,int b){
        try {
            divide(a,b);  //called the potential error having code
        }catch (NullPointerException e){
            System.out.println("The string have Null value can-not perform .length" + e);
        }
    }
}

public class J_28Exception {
    public static void main(String[] args) {
        Exception1 Exp= new Exception1();
        try {
            Exp.call_divide(10, 0);
        }catch (ArithmeticException e){
            System.out.println("Can-not divide by 0" +e);
        }

        System.out.println("If the value of b is 0 so the main method will catch the error");
    }
}
