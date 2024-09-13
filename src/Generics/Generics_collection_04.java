package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Generics_collection_04 {
    public static void main(String[] args) {
     List<Integer> list= new ArrayList<>();
     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
//        System.out.println(  list.indexOf(Integer.valueOf(20)));
        System.out.println(list.indexOf(10));
        Iterator<Integer> it= list.iterator(); // listIterator works as same
        while (it.hasNext()){
            System.out.println("iterator says"+ it.next());
        }

        Stack<Integer> S=new Stack<>();
        S.add(10); S.add(20);
        S.push(30);
        System.out.println(S.peek());
        System.out.println(S);
        System.out.println( S.pop());

    }
}