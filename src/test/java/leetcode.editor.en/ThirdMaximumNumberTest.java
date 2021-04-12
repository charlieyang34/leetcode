package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdMaximumNumberTest {

    private final ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();

    @Test
    void thirdMaximumNumber() {

        int expected = 1;
        int[] nums = new int[] {2,2,3,1};

        assertEquals(expected,thirdMaximumNumber.thirdMaximumNumber(nums) );

    }
}