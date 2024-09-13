package learn.java;
// Dynamic Method dispatch.
class A{

    void func1(){
        System.out.println("This is class A");
    }
    void print_Hello(){
        System.out.println("hello");
    }
}
class B extends A{
   @Override void func1(){
       System.out.println("this is class B");
   }
   void prit_nothing(){
       System.out.println("nothing");
   }
}


public class J_22Method_Overriding {
    public static void main(String[] args) {
        A obj1=new B();// we can create an object of parent class from child class ;
        obj1.func1(); // clild class func will called.
//        obj1.prit_nothing(); //error

//        A a1=new A();
//        B b1=new B();
//        a1.func1();
//        b1.func1();// will print this is class B

    }
}
