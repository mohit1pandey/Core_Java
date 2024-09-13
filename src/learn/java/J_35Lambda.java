package learn.java;
//

@FunctionalInterface
interface FuncXX{
    void greet();
}
public class J_35Lambda {

    public static void main(String[] args) {


//
//        FuncXX obj= new FuncXX() {
//            @Override
//            public void greet() {
//                System.out.println("hi this is lambda function")
//            }
//        };

        // lambda
        FuncXX obj= ()->System.out.println("hi this is lambda function");

        obj.greet();
    }
}
