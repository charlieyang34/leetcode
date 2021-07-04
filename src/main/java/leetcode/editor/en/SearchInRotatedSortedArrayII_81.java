package leetcode.editor.en;

public class SearchInRotatedSortedArrayII_81 {
    public boolean search(int[] nums, int target) {

        int left =0;
        int right = nums.length-1;

        while(left < right){
            int mid= left + (right - left)/2;
            if(nums[mid]==target) return true;
            if(nums[mid] > nums[right]){
                if(nums[mid]>target && nums[left] <= target) right = mid;
                else left = mid + 1;
            }else if(nums[mid] < nums[right]){
                if(nums[mid]<target && nums[right] >= target) left = mid + 1;
                else right = mid;
            }else{
                right--;
            }

        }
        return nums[left] == target;
    }
}
