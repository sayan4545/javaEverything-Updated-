package com.dev.sayan.javaC.collectionFw;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    // List interface allows storage of ordered collection of elements. Allows duplicates.
    // It is a sub interface of collection inteface . collection interface extends the Iterable interface.
    // The list interface is implemented by several classses --> ArrayList,Vector,LinkedList,Stack
    // Features--> Ordered preservation, Index based access, Allows duplicate

    /*

    ArrayList is the resizeable array implementation. It grows it size dynamically once a threshold is reached.

     */

    public static void main(String[] args) {
        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(2);
        listOfInteger.add(7);
        listOfInteger.add(10);
        listOfInteger.add(18);
        System.out.println(listOfInteger);

//        System.out.println(listOfInteger.get(1));

        for(Integer s : listOfInteger){
            System.out.println(s);
        }

        for(int i =0;i<listOfInteger.size();i++){
            System.out.print(listOfInteger.get(i)+" ");
        }
        System.out.println();
        System.out.println("size of the list is : " + listOfInteger.size());
        System.out.println();
        System.out.println("checking if the element exuists in tyhe list or not" + listOfInteger.contains(7));
        listOfInteger.remove(3);
        System.out.println(listOfInteger);
        System.out.println("size of the list is : "+ listOfInteger.size());
    }
}
