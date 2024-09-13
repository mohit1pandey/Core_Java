package learn.java;
// anonymous classes
interface Interface1{
    void greet();
    void say_bye();
}

public class J_34Anonymous {
    public static void main(String[] args) {
        //Anonymous class
        Interface1 Obj1=new Interface1() {
            @Override
            public void greet() {
                System.out.println("hello");
            }

            @Override
            public void say_bye() {
                System.out.println("Bye Bye");
            }
        };

        Obj1.greet();
        Obj1.say_bye();
    }
}
