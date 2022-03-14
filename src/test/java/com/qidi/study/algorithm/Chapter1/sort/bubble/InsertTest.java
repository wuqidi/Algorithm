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
 * @date 2022/3/15 0:38
 */
class InsertTest {

    @Test
    void sort() {
        int[] tem = new int[]{2,5,1,4,3};
        Insert.sort(tem);
        System.out.println(Arrays.toString(tem));
    }

}