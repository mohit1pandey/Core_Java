package learn.java;

public class J_14Method_Overloading {
    void method(int a){
        System.out.println("single arg"+ a);;
    }
    void method(int a,int b){
        System.out.println("two args"+ a +" "+b);;
    }
    void method(){
        System.out.println("no arg");;
    }
//    int method(){
//        return 1;
//    }
    public static void main(String[] args) {
        J_14Method_Overloading obj1= new J_14Method_Overloading();
        obj1.method();
        obj1.method(1);
        obj1.method(2,3);
    }
}
