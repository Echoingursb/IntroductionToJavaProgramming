package com.echo.demo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection<E> 接口方法demo
 * 13852831838
 */

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("A list of cities in collection1: " + collection1);
        System.out.println("Is Dallas in collection1? " + collection1.contains("Dallas"));

        collection1.remove("Dallas");
        System.out.println(collection1.size() + " cities is in collection1 now");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        System.out.println("A list of cities in collection2: " + collection2);

        ArrayList<String> c1 = (ArrayList<String>) collection1.clone();
        c1.addAll(collection2);
        System.out.println("Cities in collection1 or collection2: " + c1);

        c1 = (ArrayList<String>) collection1.clone();
        // System.out.println(c1);
        c1.retainAll(collection2);
        System.out.println("Cities in collection1 and collection2: " + c1);

        c1 = (ArrayList<String>) collection1.clone();
        c1.removeAll(collection2);
        System.out.println("Cities in collection, but not in collection2: " + c1);

    }
}
