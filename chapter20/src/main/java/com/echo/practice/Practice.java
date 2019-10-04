package com.echo.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("yellow");
        list1.add("green");
        List<String> list2 = new ArrayList<>();
        list2.add("red");
        list2.add("yellow");
        list2.add("blue");
        // a
        // list1.addAll(list2);
        // b
        // list1.add(list2);
        // c
        // list1.removeAll(list2);
        // f
        list1.clear();
        System.out.println(list1);
        System.out.println(list2);
    }
}
