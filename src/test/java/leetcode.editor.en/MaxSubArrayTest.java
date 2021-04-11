package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {

    private final MaxSubArray maxSubArray = new MaxSubArray();
    int expected = 6;
    int[] input =  new int[] {1,-3,4,-1,2,1,-5,4};

    @Test
    void maxSubArray() {
        assertEquals(expected, maxSubArray.maxSubArray(input));
    }
}