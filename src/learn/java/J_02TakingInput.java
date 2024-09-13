package learn.java;
import java.util.Scanner;

public class J_02TakingInput{
    public static void main(String[] args) {
        // make obj of scanner class.
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter another number");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("the sum of numbers is"+c);
        // System.out.printf("The sum of the numbers is: %d%n", c);
    }
}