package com.qidi.study.algorithm.Chapter1.sort.bubble;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>选择排序</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/14 23:24
 */
public class Select {
    public static void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int index = i;       //最小(大)位置

            for (int j = i + 1; j < length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            if (i != index) {
                array[i] = array[i] ^ array[index];
                array[index] = array[i] ^ array[index];
                array[i] = array[i] ^ array[index];
            }
        }
    }
}
