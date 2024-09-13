package learn.java;
//annotations in java

@FunctionalInterface
interface FuncX{
    void greet();
}

class ParentX{

    public  void get_name(){
        System.out.println("name is mohit");
    }
}
class ChildX extends ParentX{
//    @Override
//    public void get_mane(){ // mistake during overriding
//        System.out.println("name is Rohit");
//    }
        @Deprecated
    public void deprecatedFunc(){
            System.out.println("this method is Deprecated");
        }
}
public class J_33Annotation {
    @SuppressWarnings({"checked", "deprecation"})
    public static void main(String[] args) {
        ChildX child= new ChildX();
//        child.get_name(); // expected rohit but mohit will be printed/
        child.deprecatedFunc();
    }
}
