package learn.java;
//
interface Animal{
  String type="animal"; //cannot be changed it is final variable
    void make_sound(); //only declaration abstract method without abstract keyword and it is public by nature
    void run_fast();
    default  void def_method(){   // can be defined with body and can be overidden
        System.out.println("this is default method");
    }
    static void stc_method(){
        System.out.println("static method");
    }
}

class Dog implements Animal{
    @Override
    public void run_fast() { //must be public as
        System.out.println("running with 40 Kmph");
    }

    @Override
    public void make_sound(){
        System.out.println("Bark");

    }
}
public class J_24Interfaces {
    public static void main(String[] args) {
        Animal Dog1= new Dog();
        Dog1.make_sound();
        Dog1.run_fast();
        Dog1.def_method();// default method
        Animal.stc_method();
    }
}
