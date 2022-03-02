package com.katas.searchInsertPosition.main;

import java.util.Arrays;

public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums,target);
        return index < 0 ? (index+1)*-1 : index ;
    }
}
