package leetcode.editor.en;

public class BinarySearch_704 {
        public int search(int[] nums, int target) {
            // corner case

            if (nums == null || nums.length == 0)  return -1;
            int start = 0, end = nums.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] >= target) end = mid;
                else start = mid + 1;
            }
            if (nums[start] == target)   return start;
            return -1;
        }
}
