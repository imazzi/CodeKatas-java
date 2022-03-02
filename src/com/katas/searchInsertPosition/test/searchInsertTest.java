package com.katas.searchInsertPosition.test;


import com.katas.searchInsertPosition.main.SearchInsert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class searchInsertTest {
    //    Example 1:
//    Input: nums = [1,3,5,6], target = 5
//    Output: 2
    @Test
    void shouldReturnIndexOfTargetIfTheTargetExist() {
        assertEquals(2, SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 3));

    }

    @Test
    void shouldReturnIndexOfTargetIfTheTargetNotExist() {
        assertEquals(4, SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
    @Test
    void shouldReturnIndexOfTargetIfTheTargetNotExist2() {
        assertEquals(1, SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }
//    Example 2:
//    Input: nums = [1,3,5,6], target = 2
//    Output: 1

//    Example 3:
//    Input: nums = [1,3,5,6], target = 7
//    Output: 4


}
