package learn.java;
import  java.util.Arrays;
public class J_05String {
    public static void main(String[] args) {
        String str1=" Hello,World  ";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.trim());// leave spaces
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(1,7));
        System.out.println(str1.charAt(5));
        System.out.println(str1.concat("pussy"));
        System.out.println(str1.hashCode());
        System.out.println(str1.replace("Hello","callo"));
       String[] split=str1.split(",");
        System.out.println(Arrays.toString(split)); //or it will print the array address.

    }
}
