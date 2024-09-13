package learn.java;
//nested try catch

public class J_29Exception2 {
    public void divide(){

        int a=10; int b=0;
        try{

            try{
                int c=a/b;  //possibly can throw an exception
                System.out.println("the value of "+ a+"/"+b+" is "+c);
            }catch (ArithmeticException e){
                System.out.println("The requested index does not Exist inner block" + e);
            }

        }catch (ArithmeticException e){
            System.out.println("The requested index does not Exist outer block" + e);
        }
    }

    public static void main(String[] args) {
        J_29Exception2 Exp=new J_29Exception2();
        Exp.divide();
    }
}
