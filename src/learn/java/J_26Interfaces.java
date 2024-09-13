package learn.java;
//sol of Diamond problem
interface  A1 {
    void func();   //static and Abstract
    default void func1(){    // default
        System.out.println("This is Func1");
    }

}
interface A2 extends A1{
    @Override
    default void func1() {
        System.out.println("this is Func1 of A2");
    }
}
interface A3 extends A1{
    @Override
    default void func1() {
        System.out.println("this is Func1 of A3");
    }
}

interface A4 extends A2,A3{
    @Override
//    default void func1() {
//        System.out.println("this is Func1 of A3");
//    }
    default void func1() {
        A2.super.func1(); //A2's func1
    }

}
class A5 implements A4{
    public  void func(){
        System.out.println("this needs to defined");
    }
}
public class J_26Interfaces {
    public static void main(String[] args) {
        System.out.println("this wont work");

        A4 obj= new A5(); // or A5 boj =new A5() depends upon needs
        obj.func1();
        obj.func();
    }
}
