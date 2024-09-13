package learn.java;
//formal and actual argument
public class J_13Method_Overlaoding {

    void change1(int a){
        // to change a
        a=333;
    }

    void change2(int a []){
        // to change a
        a[0]=34;
    }
    public static void main(String[] args) {
         J_13Method_Overlaoding obj1=new J_13Method_Overlaoding(); //create instance
         int b=12; int [] arr1={12,20,30,40};
         obj1.change1(b); /* here a copy of b goes to change1 and it can only change varibale in its
         scope so if I print b, it will be 12*/
        obj1.change2(arr1);
        //here array will changed to {34,20,30,40} because refrence is passed
        System.out.println(b+" "+arr1[0]);
    }

}
