package leetcode.editor.en;

public class MaxSubArray {

    public int maxSubArray(int[] nums){

        int cur = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++){
            cur = Math.max(nums[i], cur+nums[i]);
            max = Math.max(cur, max);

        }
        return max;
    }
}
