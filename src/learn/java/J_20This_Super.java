package learn.java;
//this
class MyClass{
    String my_name;
    int salary ;

    MyClass(int salary, String name){
        this.my_name=name;
        this.salary=salary;
        System.out.println(my_name+" "+salary);
    }
    MyClass(){
        System.out.println("I am useless constructor");
        //  MyClass obj=new MyClass(); will overload this constructor.
        this(20000,"mohit");// argument constructor is called
    }

}

public class J_20This_Super {

    public static void main(String[] args) {
        MyClass obj=new MyClass();
    }

}
