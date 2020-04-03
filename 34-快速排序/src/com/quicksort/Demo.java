package com.quicksort;

import java.util.Arrays;

/*
 * The Best Or Nothing
 * Desinger:TheShy
 * Date:2020/4/316:27
 * com.quicksortDesignParttenQAQ
 */
public class Demo {
    public static void quickSort(int[] arr, int begin, int end) {
        //递归退出的条件
        if (begin < end) {
            //x为临时存放值
            int x = arr[begin];
            int i = begin;
            int j = end;
            while (i < j) {
                //需要找到一个小于x的时候，退出当前j--循环
                while (i < j && x <= arr[j]) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                //需要找到一个大于等于x的时候，退出当前i++循环
                while (i < j && x > arr[i]) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = x;
            quickSort(arr, begin, i - 1);
            quickSort(arr, i + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 1, 2, 31, 33, 33, 5, 9, -1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

