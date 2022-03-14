package com.qidi.study.algorithm.Chapter1.sort.bubble;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>插入</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/15 0:27
 */
public class Insert {
    public static void sort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {//正向循环
            int val = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {//负向循环
                if (array[j] > val) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = val;
        }
    }
}
