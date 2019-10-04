package com.echo.demo;

/**
 * 对一个对象数组进行排序
 */
public class GeneralSort {

    // 选择排序
    public static <E extends Comparable<E>> void sort(E[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            E currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // 如有必要交换list[i]和list[currentMinIndex]
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integers = {2, 4, 3};
        Double[] doubles = {3.4, 1.3, -22.1};
        Character[] characters = {'a', 'j', 'r'};
        String[] strings = {"Tom", "Susan", "Kim"};

        sort(integers);
        sort(doubles);
        sort(characters);
        sort(strings);

        System.out.print("Sorted Integer objects: ");
        printList(integers);
        System.out.print("Sorted Double objects: ");
        printList(doubles);
        System.out.print("Sorted String objects: ");
        printList(strings);
        System.out.print("Sorted Character objects: ");
        printList(characters);
    }

}
