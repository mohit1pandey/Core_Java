package Generics;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Generics_collection_06 {
    public static void main(String[] args) {
        Set <Integer> s= new HashSet<>(); //recommended
//        Set <Integer> S1= new LinkedHashSet<>();

        s.add(10);
        s.add(20);
        s.add(19);
        s.add(16);
        System.out.println(s);
        //all the methods of collection are applicable.
        System.out.println(s.contains(10));

    }
}
