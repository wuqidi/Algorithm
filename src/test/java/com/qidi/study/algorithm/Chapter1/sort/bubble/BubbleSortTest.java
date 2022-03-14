package com.qidi.study.algorithm.Chapter1.sort.bubble;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/14 23:02
 */
class BubbleSortTest {

    @Test
    void sort() {
        int[] tem = new int[]{2,1,4,3,6,5,8,7,0,9};
        BubbleSort.sort(tem);
        System.out.println(Arrays.toString(tem));
    }
}