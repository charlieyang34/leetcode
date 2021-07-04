package leetcode.editor.en;

public class SearchInRotatedSortedArray_33 {
    public int search(int[] nums, int target) {

        if (nums == null || nums.length == 0){
            return -1;
        }

        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int midpoint = left + (right -left)/2;

            if(nums[midpoint] > nums[right]){
                left = midpoint+1;
            }else{
                right = midpoint;
            }
        }

        int min = left;

        left = 0;
        right = nums.length-1;

        if(target >= nums[min] && target <= nums[right]){
            left = min;
        }else{
            right = min;
        }

        while(left < right){
            int midpoint = left + (right-left)/2;
            if(nums[midpoint] >= target){
                right = midpoint;
            }else{
                left = midpoint + 1;
            }
        }

        return nums[left] == target ? left : -1;
    }
}
