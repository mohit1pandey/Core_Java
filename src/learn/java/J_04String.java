package learn.java;

public class J_04String {

    public static void main(String[] args) {
        String str1= "hello";  //string obj created as hello and str1 references that onj
        String  str2= new String("world"); // same here
        str1="bye";  // now st1 refers new string.
        String str4="hello"; // str4 and old str1 will refer same string object.


     System.out.println(str1+" " +str2);
    }


}
