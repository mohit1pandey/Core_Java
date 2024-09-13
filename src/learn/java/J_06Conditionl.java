package learn.java;
import java.util.Scanner;

public class J_06Conditionl {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age");
        short age = (short) sc.nextInt(); //type cast
        if (age>18){
            System.out.println("welcome mera bhaiiii");
        }else {
            System.out.println("nikal na l****");
        }

        //switch case

        String day= "";
        switch (day) {
            case "1":
                System.out.println("monday"); break;
            case "2":
                System.out.println("tuesday");
            default:
                System.out.println("no day");
        }

    }
}
