package learn.java;

public class J_12Method {
    String name;
    J_12Method(String name){ //cosntructor
        this.name= name;
    }

    static int sum (int a,int b){
        return a/b;
    }

    public static void main(String[] args) {

        J_12Method obj1= new J_12Method("MyObj"); //cosntructor called sni

        int res=sum(10,5);
        System.out.println("my name is :"+obj1.name+ res);
    }
}
