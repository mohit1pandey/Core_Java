package Generics;
// wrapper class

public class Generics_01 {
    public static void main(String[] args) {
//        Integer intobj= new Integer(10); //Deprecated

        Integer intObj= 10;  //auto boxing
        int val=intObj;     //unboxing

        Integer intObj2= Integer.valueOf("123");
        Integer intObj3= Integer.parseInt("886");

        System.out.println(intObj2.intValue());
    }
}
