package learn.java;
// finally

public class J_32Exception {

    static int methodX() {
        int var=10;
        try {
            var++;
            System.out.println("try is modifying the value of var by 1 ");
            return var;
        }finally {
            var++;
            System.out.println("finally is modifying the value of var by 1 " + var);
        }

    }
    public static void main(String[] args) {
        System.out.println(methodX());
        }
    }







//==========================================================
//package learn.java;
//// finally
//
//public class J_32Exception {
//
//    public static void main(String[] args) {
//        int a=10; int b=10;
//        while (true){
//            try {
//                System.out.println(a / b);
////                System.exit(-1);  // no finally will execute
//                Thread.currentThread().interrupt();
//            }catch (ArithmeticException e){
//                System.out.println(e.getMessage());
//                break; // if exception handled break the loop finally will execute
//            }finally {
//                System.out.println("value of b is: "+b);
//            }
//            b--;
//        }
//    }
//}
//
//
//
//package learn.java;
//// finally
//
//public class J_32Exception {
//
//    public static void main(String[] args) {
//            int a=10; int b=10;
//            while (true){
//                try {
//                    System.out.println(a / b);
//
//                    if(b==5)return; //even we are returning at b=5 the finally will execute
//
//                }catch (ArithmeticException e){
//                    System.out.println(e.getMessage());
//                    break; // if exception handled break the loop finally will execute
//                }finally {
//                    System.out.println("value of b is: "+b);
//                }
//                b--;
//            }
//    }
//}
