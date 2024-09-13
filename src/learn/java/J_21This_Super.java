package learn.java;
//super
class MyClass2{
    String my_name="Mohit";
    int salary =20000;

    MyClass2(){
        System.out.println("parent constructor");
    }
}
class MyClass1 extends MyClass2{
    MyClass1(){
        super(); //super can only be called inside child constructor
    }

    void show_parent_data(){
        System.out.println("parent salary :"+super.salary);
        System.out.println("parent name :"+super.my_name);
    }
}

public class J_21This_Super {
    public static void main(String[] args) {

        MyClass1 M1= new MyClass1();
        M1.show_parent_data();
    }
}
