package learn.java;

class Parent{
    int val=1;
    public  Parent(){
        System.out.println("parent constructor is called");
    }
    public  Parent( int a){
       val=a;
        System.out.println("Parent 2nd constructor is called");
    }
}
class Child extends Parent{
    public Child(int a){
        super(a);
        System.out.println("Child constructor is called");
    }
}
public class J_19iConstructor_Inheritance {
    public static void main(String[] args) {
//        Child ch= new Child(); /* child class constructor calls parent once parent finishes child resumes */
        Child ch2=new Child(5); /*second constructor is called*/
    }
}
