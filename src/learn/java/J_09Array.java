package learn.java;

public class J_09Array {
    public static void main(String[] args) {
        int[] arr={10,20,60,30,45,30,44};
        System.out.println(arr.length);

        for(int i =1;i<=arr.length;i++){
            System.out.println(i);
        }
        //or
        for(int elem:arr){
            System.out.println(elem);
        }
    }
}
