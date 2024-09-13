package learn.java;

public class J_18AccessModifires1 {

    public String name="Mohit";
    protected int age=23;
    private int salary=20000;

    public int get_name(){
        return salary;
        // private member can be accessed using getter and setter
    }

    public static void main(String[] args) {

        J_18AccessModifires1 obj1= new J_18AccessModifires1();
        System.out.println(obj1.name); //can access by user1
        System.out.println(obj1.age);   //can be accessed used in case of inheritance
//        System.out.println(obj1.salary); //cannot be accessed by user 1
    }
}


class Myclass3 extends J_18AccessModifires1{
    public static void main(String[] args) {

//        System.out.println(name); // as main is static we cannot access name directaly
        Myclass3 obj2=new Myclass3();
        System.out.println(obj2.name); //user2 can access public
        System.out.println(obj2.age);  //can access protected
//        System.out.println(obj2.salary); //cannot access private

    }
}