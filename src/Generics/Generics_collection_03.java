package Generics;
//collection methods with list

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Generics_collection_03 {
    public static void main(String[] args) {

        List <Integer> list= new LinkedList<>();
        list.add(19);
        list.add(1);
        list.add(30);

        List<Integer> list2=new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list.add(10)); //true
        System.out.println(list); //[19,40,30,10]
        System.out.println(list.isEmpty()); //false

//        System.out.println(list.remove(new Integer(30)));  deprecated because Integer(30) might call remove(index).
        System.out.println(list.remove(Integer.valueOf(19)));  //to remove obj
        list.remove(1); //removes 1 index
        System.out.println(list);

        list.addAll(list2);
        System.out.println(list); //[1,10,1,2,3]
        list.removeAll(list2);    // removes common elements no matter how much it repeats
        System.out.println(list); //[10]

        list.retainAll(list2); // provide intersection list and list2

        list.clear();
        Object [] a =list.toArray();
        System.out.println(list);
    }

}
