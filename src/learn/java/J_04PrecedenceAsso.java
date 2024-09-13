package learn.java;

public class J_04PrecedenceAsso {
    public static void main(String[] args) {

        int val=11;  //cant use ++11/12 ++can not use on directly.
        int sum= ++val/12-10;
        System.out.println(sum);

        int a=1;
        int b=a++;
        System.out.println(a);
    }
}
