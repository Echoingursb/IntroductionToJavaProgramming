package echo.demo;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {
        double[] doubles = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(doubles);
        System.out.println(Arrays.toString(doubles));
    }

    /**
     * 选择排序
     *
     * @param list 待排序的数组
     */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // 找出在list[i..list.length-1]中的最小值
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
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
}
