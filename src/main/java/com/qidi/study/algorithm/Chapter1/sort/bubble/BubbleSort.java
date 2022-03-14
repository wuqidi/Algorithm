package com.qidi.study.algorithm.Chapter1.sort.bubble;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>冒泡排序</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/14 22:55
 */
public class BubbleSort {
    public static void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (array[i] > array[j]) {
                    int tem = array[i];
                    array[i] = array[j];
                    array[j] = tem;
                    /*
                    array[i] = array[i] ^ array[j];
                    array[j] = array[i] ^ array[j];
                    array[i] = array[i] ^ array[j];
                    //相同值交换为0
                    */
                }
            }
        }
    }
}
