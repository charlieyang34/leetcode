package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void twoSum() {
        int[] expected = new int[] {1,2};
        int[] nums = new int[] {3,2,4};
        int target = 6;

        assertEquals(Arrays.toString(expected), Arrays.toString(twoSum.twoSum(nums,target)));
    }
}