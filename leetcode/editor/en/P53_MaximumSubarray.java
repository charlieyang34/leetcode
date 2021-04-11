package leetcode.editor.en;

// P53_MaximumSubarray

//Given an integer array nums, find the contiguous subarray (containing at least
// one number) which has the largest sum and return its sum. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
// 
//
// Example 2: 
//
// 
//Input: nums = [1]
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: nums = [5,4,-1,7,8]
//Output: 23
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 3 * 104 
// -105 <= nums[i] <= 105 
// 
//
// 
//Follow up: If you have figured out the O(n) solution, try coding another solut
//ion using the divide and conquer approach, which is more subtle. Related Topics 
//Array Divide and Conquer Dynamic Programming 
// 👍 11494 👎 555


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
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
//leetcode submit region end(Prohibit modification and deletion)
